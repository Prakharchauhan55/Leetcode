// Last updated: 9/10/2025, 6:22:21 PM
class Solution {
  public int mySqrt(long x) {
    long l = 1;
    long r = x + 1;

    while (l < r) {
      final long m = (l + r) / 2;
      if (m > x / m)
        r = m;
      else
        l = m + 1;
    }

    // l := the minimum number s.t. l * l > x
    return (int) l - 1;
  }
}