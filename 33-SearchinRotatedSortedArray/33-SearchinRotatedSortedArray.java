// Last updated: 7/8/2026, 9:18:48 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int x = 0;
4        for(int i=0; i<nums.length; i++){
5            if(nums[i]==target){
6                x = i;
7                break;
8            } else{
9                x = -1;
10            }
11        }
12        return x;
13    }
14}