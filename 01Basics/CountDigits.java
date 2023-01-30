class Solution{
    static int evenlyDivides(int N){
        // code here
        int temp= N;
        int ct=0;
        while(temp!=0){
            int rem= temp%10;
            if(rem!=0 && N%rem==0){
                ct++;
            }
            temp=temp/10;
        }
        
        return ct;
    }
}
/*
Expected Time Complexity: O(log N)
Expected Space Complexity: O(1)
 

Constraints:
1<=N<=10^5
*/
