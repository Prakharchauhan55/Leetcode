// Last updated: 6/18/2026, 7:38:34 PM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        int pos = 0, neg = 1;
6        for(int i=0;i<n;i++) {
7            if(nums[i] >= 0) {
8                ans[pos] = nums[i];
9                pos += 2;
10            }
11            else {
12                ans[neg] = nums[i];
13                neg += 2;
14            }
15        }
16        return ans;
17    }
18}