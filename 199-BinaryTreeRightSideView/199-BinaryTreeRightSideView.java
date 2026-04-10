// Last updated: 4/10/2026, 10:38:43 AM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> ls = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if(root == null){
21            return ls;
22        }
23        q.add(root);
24        // ls.add(root.val);
25        while(q.size() > 0){
26            int c = q.size();
27            for(int i = 0;  i < c; i++){
28                TreeNode n = q.poll();
29                if(i == c-1){
30                    ls.add(n.val);
31                }
32                if(n.left != null){
33                    q.add(n.left);
34                }
35                if(n.right != null){
36                    q.add(n.right);
37                }
38            }
39        }
40        return ls;
41    }
42}