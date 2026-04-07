// Last updated: 4/7/2026, 7:22:23 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> h = new HashSet<>();
4        for(int i : nums){
5            h.add(i);
6        }
7        if(h.size() < nums.length){
8            return true;
9        }
10        else {
11            return false;
12        }
13    }
14}