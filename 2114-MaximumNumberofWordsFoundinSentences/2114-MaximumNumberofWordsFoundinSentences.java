// Last updated: 9/27/2025, 12:11:36 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
       int maxLen = 0;
		
        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen; 
    }
}