// Last updated: 10/14/2025, 5:54:13 AM
class Solution {
    public void sortColors(int[] nums) {
        
        int high = nums.length-1;
        int i = 0;
        int low = 0;
        while(i <= high){
            if(nums[i] == 0){
                
                int t = nums[low];
                nums[low] = nums[i];
                nums[i] = t;
                i++;
                low++;
                
            }
            else if(nums[i] == 2){
                int t = nums[i];
                nums[i] = nums[high];
                nums[high] = t;
                high--;
                // i++;
            }
            else{
                i++;
            }


        }

    }
}