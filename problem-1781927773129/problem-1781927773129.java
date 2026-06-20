// Last updated: 6/20/2026, 9:26:13 AM
1class Solution {
2    public int finalPositionOfSnake(int gridSize, List<String> commands) {
3        int x = 0, y = 0, n = commands.size();
4        
5        for (int i = 0; i < n; i++) {
6            String command = commands.get(i);
7            if (command.equals("UP")) {
8                x--;
9            } else if (command.equals("DOWN")) {
10                x++;
11            } else if (command.equals("RIGHT")) {
12                y++;
13            } else if (command.equals("LEFT")) {
14                y--;
15            }
16        }
17        
18        return (x * gridSize) + y;
19    }
20}