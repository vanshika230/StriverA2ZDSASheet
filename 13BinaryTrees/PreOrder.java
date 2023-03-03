
//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> ans= new ArrayList<>();
        traversalHelper(root,ans);
        return ans;
    }
    static void traversalHelper(Node root, ArrayList<Integer> ans){
         // Code here
       if(root==null){
           return;
       }
        ans.add(root.data);
        traversalHelper(root.left,ans);
        traversalHelper(root.right,ans);
    
}
}
