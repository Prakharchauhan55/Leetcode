// Last updated: 6/17/2026, 8:41:53 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count = 0;
4        int sum = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == 1){
7                sum++;
8            }
9            else{
10                sum = 0;
11            }
12            count = Math.max(sum, count);
13        }
14        return count;
15    }
16}