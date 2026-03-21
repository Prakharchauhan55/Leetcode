// Last updated: 3/21/2026, 12:03:46 PM
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
17
18    int diff = 0;
19    int res = 0;
20
21    public boolean isBalanced(TreeNode root) {
22        check(root);
23        if(res == -1){
24            return false;
25        }
26        return true;
27    }
28
29    public int check(TreeNode root){
30
31        if(root == null){
32            return 0;
33        }
34
35        int left = check(root.left);
36        int right = check(root.right);
37
38        diff = Math.abs(left - right);
39        if(diff > 1){
40            res = -1;
41        }
42
43        return 1 + Math.max(left, right);
44
45    }
46}