// Last updated: 1/17/2026, 11:56:36 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        Stack<Character> bracket = new Stack<>();
4        StringBuilder sb = new StringBuilder("");
5        for(int i=0;i<s.length();i++){
6            if(s.charAt(i)=='('){
7                if(bracket.size()>0){
8                    sb.append(s.charAt(i));
9                }
10                bracket.push(s.charAt(i));
11            }else{
12                bracket.pop();
13                if(bracket.size()>0){
14                    sb.append(s.charAt(i));
15                }
16            }
17        }
18        return sb.toString();
19    }
20}