// Last updated: 9/10/2025, 6:22:12 PM
class Solution {
  public int singleNumber(int[] nums) {
    int res = 0;
    for(int i = 0; i < nums.length; i++){
        res = res ^ nums[i];
    }
    return res;
  }
}