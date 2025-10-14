// Last updated: 10/14/2025, 7:02:45 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int l =0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if ( target >=arr[mid][0] && target<= arr[mid][arr[0].length-1]){
                for (int i = 0; i< arr[0].length ;i++){
                    if (target == arr[mid][i]) return true ;
                }
                return false;
            }
            else if(arr[mid][0] > target){ 
                h = mid-1;
            }
            else if(arr[mid][0] < target){
                l = mid+1;
            }
        }
        return false;
    }
}