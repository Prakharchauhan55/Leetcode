// Last updated: 4/6/2026, 11:32:08 PM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        HashMap<Character, Integer> hs1 = new HashMap<>();
4        HashMap<Character, Integer> hs2 = new HashMap<>();
5
6
7        for(int i = 0; i < ransomNote.length(); i++){
8            Character ch1 = ransomNote.charAt(i);
9            hs1.put(ch1,hs1.getOrDefault(ch1,0)+1);
10        }
11
12        for(int i = 0; i < magazine.length(); i++){
13            Character ch2 = magazine.charAt(i);
14            hs2.put(ch2,hs2.getOrDefault(ch2,0)+1);
15        }
16
17        for(Character ch : hs1.keySet()){
18            if(!hs2.containsKey(ch)){
19                return false;
20            }
21            else if(hs1.get(ch) > hs2.get(ch)){
22                return false;
23            }
24        }
25        return true;
26
27        // System.out.print(hs1);
28
29        // for(int i = 0 ; i < hs1.length(); i++){
30            
31        // }
32        // return true;
33        
34
35    }
36}