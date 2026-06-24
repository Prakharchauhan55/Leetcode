// Last updated: 6/24/2026, 6:24:08 AM
1class Solution {
2    public int maxDepth(String s) {
3        int max = 0;
4        int count = 0;
5        // Stack<Character> st = new Stack<>();
6        for(char ch : s.toCharArray()){
7            // char ch = s.charAt(i);
8            if(ch == '('){
9                count++;
10            }
11            else if(ch == ')'){
12                count--;
13            }
14            max = Math.max(count, max);
15        }
16        return max;
17    }
18}