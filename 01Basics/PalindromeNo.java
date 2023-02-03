class Solution {
    public boolean isPalindrome(int n) {
                // Code here
       int num=0;
       int temp=n;
        
       int ans=0;
       if(temp<0){
         return false;
         }
       
        while(n!=0){
            num=n%10;
            ans=num+ans*10;
            n=n/10;
            }
        
        if(temp==ans){
            return true;
        }

        else{
            return false;
    }
    }
}
