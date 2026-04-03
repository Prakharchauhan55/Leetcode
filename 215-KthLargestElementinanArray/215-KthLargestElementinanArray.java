// Last updated: 4/3/2026, 11:16:10 AM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>();
4        for(int num : nums){
5            pq.add(num);
6        }
7        int n = nums.length-1;
8        int x = n-k;
9        
10        for(int i = 0; i <= x; i++){
11            pq.poll();
12        }
13
14        return pq.peek();
15        
16
17    }
18}