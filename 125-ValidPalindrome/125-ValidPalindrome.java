// Last updated: 9/10/2025, 6:22:13 PM
class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n =a.length();
        for(int i = 0; i < a.length()/2 ; i++){
            if(a.charAt(i) != a.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}