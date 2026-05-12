class Solution {
    public void rotate(int[][] m) {
        int n = m.length;

        
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++) {
                int t = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = t;
            }

        
        for (int[] row : m) {
            int l = 0, r = n - 1;
            while (l < r) {
                int t = row[l];
                row[l++] = row[r];
                row[r--] = t;
            }
        }
    }
}