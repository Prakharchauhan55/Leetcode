// Last updated: 9/10/2025, 6:21:44 PM
class Solution {
    public int countDigits(int num) {
        int answer = 0;
        int n = num;
        while(n>0){
            if(num % (n%10) == 0) answer++;
            n/=10;
        }
        return answer;
    }
}