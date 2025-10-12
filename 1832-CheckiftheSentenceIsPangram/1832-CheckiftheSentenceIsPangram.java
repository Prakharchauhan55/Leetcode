// Last updated: 10/12/2025, 10:18:02 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        
        char[] c = sentence.toCharArray();
        Arrays.sort(c);
        
        int uc = 0;
        for(int i = 0; i < c.length ; i++){
            if( i == 0 || c[i] != c[i-1]){
                uc++;
            }
        }
        
        return (uc == 26);
    }
}