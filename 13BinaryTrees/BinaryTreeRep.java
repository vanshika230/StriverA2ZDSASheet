//User function Template for Java

class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        Queue<Node> q= new LinkedList<>();
        q.add(root0);// pehla wala ghusa diya
        int ct=1;
        int length= v.size();
        while(ct<length){
                Node temp=q.poll(); // baap ko nikala
                Node leftNode= new Node(v.get(ct)); // uska left bacha banaya
                temp.left=leftNode;
                q.add(leftNode); // q mein add kardiya
                ct++;
                Node rightNode= new Node(v.get(ct)); //right bacha banaya
                temp.right=rightNode;
                q.add(rightNode);
                ct++;
                
        }
        
    }
}
