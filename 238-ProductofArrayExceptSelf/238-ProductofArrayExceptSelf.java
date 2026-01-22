// Last updated: 1/22/2026, 7:39:19 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] p_arr = new int[nums.length];
5        int[] s_arr = new int[nums.length];
6        int[] ans = new int[nums.length];
7        int p_product = 1;
8        int s_product = 1;
9        for(int i = 0; i < nums.length; i++){
10            p_arr[i] = p_product * nums[i];
11            p_product = p_arr[i];
12             s_arr[n-i-1] = s_product * nums[n-i-1];
13            s_product = s_arr[n-i-1];
14        }
15          
16
17        
18
19
20
21        for(int i = 0 ; i < nums.length; i++){
22            if(i == 0){
23                ans[i] = s_arr[i+1];
24            }
25            else if(i == nums.length-1){
26                ans[i] = p_arr[i-1];
27            }
28            else{
29                ans[i] = p_arr[i-1] * s_arr[i+1];
30            }
31        }
32
33        return ans;
34
35    }
36}