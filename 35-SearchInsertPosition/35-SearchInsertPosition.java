// Last updated: 9/10/2025, 6:22:26 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==target){
                
                return i;
            }
            else if(nums[i]>target){
                break;
            }
            n++;
        }
        return n;
    }
}