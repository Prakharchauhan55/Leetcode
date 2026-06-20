// Last updated: 6/20/2026, 9:50:24 AM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int[][] ans = new int[n][m];
7
8        for(int i = 0; i < m; i++) {
9            for(int j = 0; j < n; j++) {
10                ans[j][i] = matrix[i][j];
11            }
12        }
13
14        return ans;
15    }
16}