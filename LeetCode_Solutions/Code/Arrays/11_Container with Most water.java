
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        
        int maxA = 0;

        while (left < right) {

            int w = right - left;
            int minh = Math.min(height[left], height[right]);
            
            int area = w * minh;

            maxA = Math.max(maxA, area);

    if (height[left] < height[right]) {
// right--;
                left++;
            } 

            else {
                right--;


            }
        }

        return maxA;
    }
}
