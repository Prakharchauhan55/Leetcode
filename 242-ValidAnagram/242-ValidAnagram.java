// Last updated: 6/23/2026, 8:38:10 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length())
4            return false;
5
6        int[] arr = new int[26];
7
8        for (int i = 0; i < s.length(); i++) {
9            arr[s.charAt(i) - 'a']++;
10            arr[t.charAt(i) - 'a']--;
11        }
12
13        for (int check : arr) {
14            if (check != 0)
15                return false;
16        }
17
18        return true;
19    }
20}