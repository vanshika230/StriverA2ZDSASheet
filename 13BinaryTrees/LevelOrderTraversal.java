/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
*/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        
        if(root == null) return ans;
        q.add(root);

        while(!q.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode par=q.remove();

                list.add(par.val);

                if(par.left!=null){
                    q.add(par.left);
                }
                if(par.right!=null){
                    q.add(par.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
