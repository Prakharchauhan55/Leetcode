// Last updated: 9/10/2025, 6:22:27 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []arr ={-1,-1};
        int left =0;
        int right=nums.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(nums[mid]<target){
              left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;

            }
            else{
                if(mid==left||nums[mid]!=nums[mid-1]){
                    arr[0]=mid;
                    break;
                }
                else{
                    right=mid-1;
                }
            }
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid =(left+right)/2;
            if(nums[mid]<target){
              left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid-1;

            }
            else{
                if(mid==right||nums[mid]!=nums[mid+1]){
                    arr[1]=mid;
                    break;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return arr;
    }
}
