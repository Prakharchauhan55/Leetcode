// Last updated: 8/8/2026, 6:18:07 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        StringBuilder sb = new StringBuilder();
4        Arrays.sort(strs);
5        String s1 = strs[0];
6        String s2 = strs[strs.length-1];
7        for(int i = 0; i < s1.length(); i++){
8            if(s1.charAt(i) == s2.charAt(i)){
9                sb.append(s1.charAt(i));
10            }
11            else{
12                break;
13            }
14        }
15        return sb.toString();
16    }
17}