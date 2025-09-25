// Last updated: 9/25/2025, 11:48:43 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumsingle=0;
        int sumdouble=0;
        for(int x : nums){
            if(x<10){
                sumsingle+=x;
            }else{
                sumdouble+=x;            }
        }
        return sumsingle!=sumdouble;
    }
}