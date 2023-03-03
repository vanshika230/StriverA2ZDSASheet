//User function Template for Java


/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
   ArrayList<Integer> findSpiral(Node root) 

    {

        ArrayList<Integer> list=new ArrayList<Integer>();

        int level=1;

        if(root==null)

        return list;

        Queue<Node> q=new LinkedList<>();

        

        q.add(root);

        while(q.isEmpty()==false)

        {

            int count=q.size();

            ArrayList<Integer> l2=new ArrayList<Integer>();

            for(int i=0;i<count;i++)

            {   

                Node curr=q.poll();

                if(level%2==0)

                {

                    list.add(curr.data);

                }

                else

                {

                    l2.add(curr.data);

                }

                if(curr.left!=null)

                q.add(curr.left);

                if(curr.right!=null)

                q.add(curr.right);

            }

            if(l2.isEmpty()==false)

            {

                Collections.reverse(l2);

                list.addAll(l2);

            }

            level++;

        }

        return list;

    }
}
