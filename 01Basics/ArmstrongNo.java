
//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int temp=n;
        int sum=0;
        while(temp!=0){
            int rem= temp%10;
            sum+=Math.pow(rem,3);
            temp=temp/10;
        }
        if(sum==n){
            return "Yes";
        }
        return "No";
    }
