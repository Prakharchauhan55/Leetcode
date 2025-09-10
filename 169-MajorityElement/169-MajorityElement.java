// Last updated: 9/10/2025, 6:22:09 PM
class Solution {
  public int majorityElement(int[] nums) {
    Integer ans = null;
    int count = 0;

    for (final int num : nums) {
      if (count == 0)
        ans = num;
      count += num == ans ? 1 : -1;
    }

    return ans;
  }
}