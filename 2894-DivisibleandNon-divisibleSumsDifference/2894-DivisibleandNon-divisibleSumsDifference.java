// Last updated: 9/29/2025, 12:18:54 AM
class Solution {
    public int differenceOfSums(int num1, int d) {
        int sum = num1*(num1+1)/2;
        int n = num1/d;
        int sum1 = (int)(((double)(n)/2)*(2*d + (n-1)*d));
        
        return sum - (2*sum1);
    }
}