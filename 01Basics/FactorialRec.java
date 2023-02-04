//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        long i=1;
        ArrayList<Long> ans= new ArrayList<>();
        while(factorial(i)<=N){
            ans.add(factorial(i));
            i++;
        }
     return ans;
    }
    static long factorial(long n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
