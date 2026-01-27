// Last updated: 1/27/2026, 3:11:53 PM
1class Solution {
2    public int[][] merge(int[][] arr) {
3        Arrays.sort(arr , (a,b)-> a[0]-b[0]);
4        List<int[]> list = new ArrayList<>() ;
5        int start=arr[0][0];
6        int end = arr[0][1];
7        for(int i=1;i<arr.length;i++){
8            int s= arr[i][0];
9            int e= arr[i][1];
10            if(s<=end){
11                end=Math.max(e,end);
12            }
13            else{
14                list.add(new int[]{start,end});
15                start=s;end=e;
16            }
17        }
18        list.add(new int[]{start,end});
19        return list.toArray(new int[list.size()][]);
20    }
21}