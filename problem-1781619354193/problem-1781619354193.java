// Last updated: 6/16/2026, 7:45:54 PM
1class Solution {
2    public boolean check(int[] nums) {
3        int count = 0;
4        int n = nums.length;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] > nums[(i+1)%n]){
7                count++;
8            }
9        }
10        if(count > 1){
11            return false;
12        }
13        return true;
14    }
15}