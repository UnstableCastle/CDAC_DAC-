class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int total = n + m;

        int i = 0, j = 0;
        int prev = 0, curr = 0;

        for(int k = 0; k <= total / 2; k++){
            prev = curr;

            if(i < n && (j >= m || nums1[i] < nums2[j])){
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }
        }

        if(total % 2 == 1){
            return curr;
        } else {
            return (prev + curr) / 2.0;
        }
    }
}