// Last updated: 4/8/2026, 10:58:43 AM
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public int longestConsecutive(int[] nums) {
6        if (nums.length == 0) {
7            return 0;
8        }
9        
10        Set<Integer> numSet = new HashSet<>();
11        for (int num : nums) {
12            numSet.add(num);
13        }
14
15        int longestStreak = 0;
16
17        for (int num : numSet) {
18            // Check if 'num' is the start of a sequence
19            if (!numSet.contains(num - 1)) {
20                int currentNum = num;
21                int currentStreak = 1;
22                
23                // Count how long the streak is
24                while (numSet.contains(currentNum + 1)) {
25                    currentNum++;
26                    currentStreak++;
27                }
28                
29                longestStreak = Math.max(longestStreak, currentStreak);
30            }
31        }
32        
33        return longestStreak;
34    }
35}