// Last updated: 9/10/2025, 6:22:01 PM
class Solution {
    public int addDigits(int num) {
        // int sum = 0;
        // while(num/10==0){
        //     int rem = num % 10;
        //     sum += rem;
        //     num = num / 10;
        // }
        // return sum;
        if(num == 0){
            return 0;
        }
        if(num == 9){
            return 9;
        }
        if(num % 9 == 0){
            return 9;
        }
        else{
            return num % 9;
        }
    }
}