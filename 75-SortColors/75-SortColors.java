// Last updated: 9/14/2025, 7:36:54 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                // nums[low] = nums[low] + nums[mid];
                // nums[mid] = nums[low] - nums[mid];
                // nums[low] = nums[low] - nums[mid];
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                // nums[high] = nums[high] + nums[mid];
                // nums[mid] = nums[high] - nums[mid];
                // nums[high] = nums[high] - nums[mid];
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
    }
}