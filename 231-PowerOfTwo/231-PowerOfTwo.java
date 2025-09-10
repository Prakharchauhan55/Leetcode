// Last updated: 9/10/2025, 6:22:03 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){ return true; }
		if(n==0){ return false; }
		if(n%2!=0){return false; }
		else{ return isPowerOfTwo(n/2); }
    }
}