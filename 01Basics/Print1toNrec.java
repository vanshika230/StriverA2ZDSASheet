
class Solution
{
    
  public void printNos(int N)
    {   if(N==0){
        return;
        }
        //Your code here
        printNos(N-1);
        System.out.print(N+" ");
    }
}
