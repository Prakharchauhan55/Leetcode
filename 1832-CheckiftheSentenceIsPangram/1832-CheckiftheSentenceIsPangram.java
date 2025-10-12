// Last updated: 10/12/2025, 10:17:15 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        
        char[] chrr = sentence.toCharArray();
        Arrays.sort(chrr);
        
        int uniqueCount = 0;
        for(int i = 0; i < chrr.length ; i++){
            if( i == 0 || chrr[i] != chrr[i-1]){
                uniqueCount++;
            }
        }
        
        return (uniqueCount == 26);
    }
}