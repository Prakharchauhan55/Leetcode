// Last updated: 1/17/2026, 10:38:26 PM
1class Solution {
2    public String makeGood(String s) {
3        if (s.length() == 0) return "";
4
5        Stack<Character> st = new Stack<>();
6        char[] ch = s.toCharArray();
7
8        for (char c : ch) {
9            if (!st.isEmpty()
10                && Character.toLowerCase(c) == Character.toLowerCase(st.peek())
11                && c != st.peek()) {
12                st.pop();
13            } else {
14                st.push(c);
15            }
16        }
17
18        StringBuilder sb = new StringBuilder();
19        for (char c : st) {
20            sb.append(c);
21        }
22
23        return sb.toString();
24    }
25}
26