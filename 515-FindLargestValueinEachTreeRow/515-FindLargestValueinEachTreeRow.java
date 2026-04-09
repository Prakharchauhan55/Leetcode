// Last updated: 4/10/2026, 1:40:44 AM
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
17    public List<Integer> largestValues(TreeNode root) {
18        List<Integer> ls = new ArrayList<>();
19        if(root == null) return ls;
20
21        Queue<TreeNode> q = new LinkedList<>();
22        q.add(root);
23
24        while(!q.isEmpty()){
25            int max = Integer.MIN_VALUE;
26            int c = q.size();
27
28            for(int i = 0; i < c; i++){
29                TreeNode n = q.poll();
30                max = Math.max(n.val, max);
31
32                if(n.left != null) q.add(n.left);
33                if(n.right != null) q.add(n.right);
34            }
35
36            ls.add(max);
37        }
38
39        return ls;
40    }
41}