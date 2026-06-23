// Last updated: 6/23/2026, 3:01:20 PM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder ans = new StringBuilder();
4        int depth = 0;
5
6        for (char ch : s.toCharArray()) {
7            if (ch == '(') {
8                if (depth > 0) ans.append(ch);
9                depth++;
10            } 
11            else {
12                depth--;
13                if (depth > 0) ans.append(ch);
14            }
15        }
16
17        return ans.toString();
18    }
19}