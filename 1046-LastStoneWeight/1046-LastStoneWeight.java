// Last updated: 4/2/2026, 6:41:04 PM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4        for(int num : stones){
5            pq.add(num);
6        }
7        while(pq.size() > 1){
8            int x = pq.poll();
9            int y = pq.poll();
10            if(x != y){
11                pq.add(Math.abs(x-y));
12            }
13        }
14        if(pq.isEmpty() ){
15            return 0;
16        }
17        else{
18            return pq.peek();
19        }
20    }
21}