//User function Template for Java
class Solution{

    static long sumOfDivisors(int N){

        // code here
      long sum =0;
        for(int i =1; i<=N; i++){
          for(int j=1;j<=i;j++){
           if(j%i==0){
                sum = sum+i;
            }  
        }
        }
        return sum;

    }

}
