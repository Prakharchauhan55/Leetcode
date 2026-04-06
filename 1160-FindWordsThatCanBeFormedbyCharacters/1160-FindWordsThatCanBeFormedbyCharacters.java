// Last updated: 4/6/2026, 11:57:54 PM
1class Solution {
2    public int countCharacters(String[] words, String chars) {
3        HashMap<Character,Integer> map = new HashMap<>();
4        for(int i = 0;i<chars.length();i++){
5            char ch = chars.charAt(i);
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        int ans = 0;
9        for(String s :words){
10            boolean chk = true;
11             HashMap<Character,Integer> map2 = new HashMap<>();
12            for(int i = 0;i<s.length();i++){
13                char ch = s.charAt(i);
14               map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
15               if(!map.containsKey(ch)){
16                chk = false;
17                break;
18               }
19               if(map2.get(ch)>map.get(ch)){
20                chk = false;
21                break;
22               }
23            }
24            if(chk)
25         ans+=s.length();
26        }
27        return ans;
28    }
29}