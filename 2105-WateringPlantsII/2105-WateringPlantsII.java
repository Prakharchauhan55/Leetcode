// Last updated: 1/20/2026, 9:28:08 AM
1class Solution {
2    public int minimumRefill(int[] plants, int CA, int CB) {
3        int canA = CA;
4        int canB = CB;
5        int r = 0;
6        int l = 0;
7        int h = plants.length-1;
8        while(l <= h){
9            if(l==h){
10                if(CB > CA){
11                    if(CB >= plants[h]){
12                        CB = CB - plants[h];
13                    }
14                    else{
15                        r += 1;
16                        CB = canB;
17                        CB = CB - plants[h];
18                    }
19                }
20                else{
21                    if(CA >= plants[l]){
22                        CA = CA - plants[l];
23                    }
24                    else{
25                        r += 1;
26                        CA = canA;
27                        CA = CA - plants[l];
28                    }
29                }
30            }
31            else{
32                if(CA >= plants[l]){
33                    CA = CA - plants[l];
34                }
35                else{
36                    r += 1;
37                    CA = canA;
38                    CA = CA - plants[l];
39                }
40
41                if(CB >= plants[h]){
42                    CB = CB - plants[h];
43                }
44                else{
45                    r += 1;
46                    CB = canB;
47                    CB = CB - plants[h];
48                }
49            }
50
51            l++;
52            h--;
53        }
54        return r;
55    }
56}