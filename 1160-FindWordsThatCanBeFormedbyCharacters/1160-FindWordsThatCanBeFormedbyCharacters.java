// Last updated: 4/7/2026, 11:30:40 AM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set1 = new HashSet<>();
4        for(int n : nums1){
5            set1.add(n);
6        }
7
8        HashSet<Integer> result = new HashSet<>();
9        for(int n : nums2){
10            if(set1.contains(n)){
11                result.add(n);
12            }
13        }
14
15        int[] ans = new int[result.size()];
16        int i = 0;
17        for(int val : result){
18            ans[i++] = val;
19        }
20
21        return ans;
22    }
23}