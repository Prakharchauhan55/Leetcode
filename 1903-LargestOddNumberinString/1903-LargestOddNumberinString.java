// Last updated: 6/23/2026, 4:06:27 PM
1class Solution {
2    public String largestOddNumber(String num) {
3
4        for(int i = num.length() - 1; i >= 0; i--){
5
6            if(num.charAt(i) % 2 != 0){
7                return num.substring(0, i + 1);
8            }
9        }
10
11        return "";
12    }
13}