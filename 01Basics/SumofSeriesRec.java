
// User function Template for Java

class Solution {
    long sumOfSeries(long N) {
        // code here
        if(N<0){
            return 0;
        }
        return (long)Math.pow(N,3)+sumOfSeries(N-1);
    }
}
