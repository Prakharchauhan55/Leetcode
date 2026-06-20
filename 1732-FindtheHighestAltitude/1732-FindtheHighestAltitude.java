// Last updated: 6/20/2026, 4:58:08 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int count = 0;
4        int sum = 0;
5        for(int i = 0; i < gain.length; i++){
6            sum += gain[i];
7            count = Math.max(count, sum);
8        }
9        return count;
10    }
11}