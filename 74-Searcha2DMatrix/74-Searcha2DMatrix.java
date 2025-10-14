// Last updated: 10/14/2025, 7:04:07 PM
class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int l =0;
        int h = arr.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if ( target >=arr[mid][0] && target<= arr[mid][arr[0].length-1]){
                int i = 0;
                int j = arr[0].length-1;
                while(i<=j){
                    int k = (i+j)/2;
                    if(arr[mid][k] == target){
                        return true;
                    }
                    else if(arr[mid][k] > target){
                        j = k-1;

                    }
                    else{
                        i = k+1;
                    }

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