// Last updated: 1/15/2026, 9:03:50 PM
1class Solution {
2    public int calPoints(String[] arr) {
3      
4        Stack<Integer> st = new Stack<>();
5
6        for(int i=0; i<arr.length; i++){
7
8            String s = arr[i];
9            if(s.equals("C"))st.pop();
10            else if(s.equals("D"))st.push(2*st.peek());
11            else if(s.equals("+")){
12                int top = st.pop();
13                int sec = st.peek();
14                int sum = top + sec;
15                st.push(top);
16                st.push(sum);
17            }
18            else{
19                st.push(Integer.parseInt(s));
20            }
21
22        }
23        int sum = 0;
24        while(st.size()>0){
25            sum += st.pop();
26        }
27        return sum;
28    
29        
30    }
31}