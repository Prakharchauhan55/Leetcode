// Last updated: 3/21/2026, 5:24:27 PM
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
17    public boolean checkTree(TreeNode root) {
18        int sum = 0;
19        sum = root.left.val + root.right.val;
20        if(root.val == sum){
21            return true;
22        }
23        else{
24            return false;
25        }
26    }
27}