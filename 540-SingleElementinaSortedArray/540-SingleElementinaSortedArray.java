// Last updated: 9/13/2025, 11:18:11 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = (low + high)/2;

            // if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
            //     return nums[mid];
            // }
            // // 
            // else if(nums[mid] == nums[mid-1] && mid-1 % 2 != 0){
            //     high = mid - 2;
            // }
            // else if(nums[mid] == nums[mid+1] && mid % 2 != 0){
            //     high = mid - 1;
            // }  
            // // 
            // else if(nums[mid] == nums[mid-1] && mid-1 % 2 == 0){
            //     low = mid + 2;
            // }
            // else if(nums[mid] == nums[mid+1] && mid % 2 == 0){
            //     low = mid +1;
            // }
            if(mid % 2 == 1){
                mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
            