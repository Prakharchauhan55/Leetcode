// Last updated: 1/20/2026, 8:42:51 AM
1class Solution {
2    public int wateringPlants(int[] plants, int capacity) {
3        int steps = 0;
4        int can = capacity;
5        for(int i = 0; i< plants.length; i++){
6            if(capacity >= plants[i]){
7                steps += 1;
8                capacity -= plants[i];
9            }
10            else{
11                steps = ((i*2)+1)+steps;
12                capacity = can;
13                capacity -= plants[i];
14            }
15        }
16        return steps;
17    }
18}