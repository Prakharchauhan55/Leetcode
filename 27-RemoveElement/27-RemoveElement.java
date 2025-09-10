// Last updated: 9/10/2025, 6:22:30 PM
class Solution {
  public int removeElement(int[] nums, int val) {
    int i = 0;

    for (final int num : nums)
      if (num != val)
        nums[i++] = num;

    return i;
  }
}