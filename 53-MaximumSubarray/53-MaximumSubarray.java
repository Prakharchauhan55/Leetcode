// Last updated: 6/18/2026, 6:41:15 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int res = Integer.MIN_VALUE;
4        int sum = 0;
5
6        for(int i = 0; i < nums.length; i++){
7            sum += nums[i];
8            res = Math.max(res, sum);
9            if(sum < 0){
10                sum = 0;
11            }
12        }
13        return res;
14    }
15}