// Last updated: 3/21/2026, 11:25:34 AM
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
18    int maxi = 0;
19
20    public int diameterOfBinaryTree(TreeNode root) {
21        // int max = Integer.MIN_VALUE;
22        // return leftBT(root.left) + rightBT(root.right) ;
23        maxDia(root);
24        return maxi;
25
26    }
27    // public int leftBT(TreeNode root){
28    //     if(root == null){
29    //         return 0;
30    //     }
31    //     else{
32    //         return Math.max(leftBT(root.left),leftBT(root.right)) + 1;
33    //     }
34    // }
35    // public int rightBT(TreeNode root){
36    //     if(root == null){
37    //         return 0;
38    //     }
39    //     else{
40    //         return Math.max(rightBT(root.left),rightBT(root.right)) +1;
41    //     }
42    // }
43
44    public int maxDia(TreeNode root){
45
46        if(root == null){
47           return 0;
48        }
49
50        int left = maxDia(root.left); 
51        int right = maxDia(root.right);
52
53        maxi = Math.max(maxi, left+right);
54
55        return 1 + Math.max(left, right);
56    }
57}
58
59
60
61
62