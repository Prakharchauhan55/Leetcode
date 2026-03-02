// Last updated: 3/3/2026, 12:49:43 AM
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> ls = new ArrayList<>();
19        helper(ls, root);
20        return ls;
21    }
22    public static void helper(List<Integer> ls, TreeNode root){
23        if(root == null){
24            return;
25        }
26        helper(ls, root.left);
27        ls.add(root.val);
28        helper(ls, root.right);
29    }
30}