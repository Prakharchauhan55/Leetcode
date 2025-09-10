// Last updated: 9/10/2025, 6:22:11 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            char ch = (char)('A' + rem);
            res.append(ch);
            columnNumber /= 26;
        }
        return res.reverse().toString();
    }
}