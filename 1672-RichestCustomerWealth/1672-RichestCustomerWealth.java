// Last updated: 9/25/2025, 12:01:13 AM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int curSum = 0;
        for (int[] customers : accounts) {
            int sum = 0;
            for(int account : customers){
                sum += account;
            }
            if (sum > curSum) {
                curSum = sum;
            }
        }
        return curSum;
    }
}