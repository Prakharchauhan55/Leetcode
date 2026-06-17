// Last updated: 6/17/2026, 8:52:22 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int XOR1 = 0;
4        for(int i = 0; i < nums.length; i++){
5            XOR1 = XOR1^nums[i];
6        }
7        return XOR1;
8    }
9}