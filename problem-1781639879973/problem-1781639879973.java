// Last updated: 6/17/2026, 1:27:59 AM
1class Solution {
2    public int missingNumber(int[] nums) {
3       int n = nums.length;
4       int tot = (n*(n+1))/2;
5       int sum = 0;
6       for(int i=0;i<n;i++){
7        sum = sum+nums[i];
8       }
9       return (tot-sum);
10    }
11}