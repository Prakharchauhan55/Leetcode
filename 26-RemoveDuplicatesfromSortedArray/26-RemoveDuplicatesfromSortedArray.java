// Last updated: 6/16/2026, 11:49:21 PM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3      if(nums.length == 0) return 0;
4      int res = 1;
5      for(int i = 1; i < nums.length; i++){
6        if(nums[i] != nums[i - 1]){
7          nums[res] = nums[i];
8          res++;
9        }
10      }
11      return res;
12    }
13}