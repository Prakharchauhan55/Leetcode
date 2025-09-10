// Last updated: 9/10/2025, 6:22:14 PM
class Solution {
    public int maxProfit(int[] price) {
        int p=price[0];
        int po=0;
        for(int i=1;i<price.length;i++){
            if(p>price[i]){
                p=price[i];
            }
        
        po=Math.max(po,price[i]-p);
        }
        return po;

    }
}