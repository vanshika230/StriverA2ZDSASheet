//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       // Your code goes here
       ArrayList<Integer> ans= new ArrayList<>();
       traversal(root,ans);
       return ans;
    }
    static void traversal(Node root, ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        traversal(root.left,ans);
        traversal(root.right,ans);
        ans.add(root.data);
    }
}
