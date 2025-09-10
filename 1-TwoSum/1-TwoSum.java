// Last updated: 9/10/2025, 6:22:43 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int left = 0;
        for(int i=0;i<=nums.length;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
};