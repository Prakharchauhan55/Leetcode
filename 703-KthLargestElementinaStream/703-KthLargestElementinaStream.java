// Last updated: 4/2/2026, 4:46:18 PM
1class KthLargest {
2
3    PriorityQueue<Integer> pq;
4    int k;
5
6    public KthLargest(int k, int[] nums) {
7        this.k = k;
8        pq = new PriorityQueue<>();
9        for(int num : nums){
10            add(num);
11        }
12    }
13    
14    public int add(int val) {
15        if(pq.size() < k || pq.peek() < val){
16            pq.offer(val);
17            if(pq.size() > k){
18                pq.poll();
19            }
20        }
21        return pq.peek();
22    }
23}
24
25/**
26 * Your KthLargest object will be instantiated and called as such:
27 * KthLargest obj = new KthLargest(k, nums);
28 * int param_1 = obj.add(val);
29 */