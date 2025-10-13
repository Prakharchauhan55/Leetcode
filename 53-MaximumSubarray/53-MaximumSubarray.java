// Last updated: 10/13/2025, 10:04:49 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        if(max == 0){
            int maxi = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++){
                maxi = Math.max(maxi, nums[i]);
            }
            max = maxi;
        }
        return max;
    }
}