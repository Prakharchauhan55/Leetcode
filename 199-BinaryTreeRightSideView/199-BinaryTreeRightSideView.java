// Last updated: 4/10/2026, 11:34:57 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> res = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if(root == null) return res;
21        int flag = 0;
22        q.add(root);
23        while(q.size() > 0){
24            int c = q.size();
25            
26            List<Integer> ls = new ArrayList<>();
27            
28                for(int i = 0; i < c; i++){
29                    TreeNode n = q.poll();
30                    if(flag % 2 == 0){
31                        ls.addLast(n.val);
32                    }
33                    else{
34                        ls.addFirst(n.val);
35                    }
36                    if(n.left != null){
37                        q.add(n.left);
38                    }
39                    if(n.right != null){
40                        q.add(n.right);
41                    }
42                }
43            
44            
45            flag++;
46            res.add(ls);
47        }
48        return res;
49    }
50}