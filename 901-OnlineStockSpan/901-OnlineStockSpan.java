// Last updated: 1/16/2026, 8:37:34 AM
1class StockSpanner {
2    Stack<int[]> st;
3    public StockSpanner() {
4        st = new Stack<>();
5    }
6    public int next(int price) {
7        int span = 1;
8        while (!st.isEmpty() && st.peek()[0] <= price) {
9            span += st.pop()[1];
10        }
11        st.push(new int[] {price, span});
12        return span;
13    }
14}
15
16/**
17 * Your StockSpanner object will be instantiated and called as such:
18 * StockSpanner obj = new StockSpanner();
19 * int param_1 = obj.next(price);
20 */