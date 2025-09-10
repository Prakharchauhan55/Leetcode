// Last updated: 9/10/2025, 6:22:17 PM
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res= new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root!=null)q.add(root);
        
        while(!q.isEmpty()){
                List<Integer>list= new ArrayList<>();
                int x= q.size();
                for(int i=0;i<x;i++){
                    TreeNode temp=q.poll();
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                    list.add(temp.val);
                }
                res.add(list);
            
            }
        
        return res;
        
    }
}