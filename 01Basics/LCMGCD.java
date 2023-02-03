class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ans = new Long[2];
        Long n1=A;
        Long n2=B; 
      
        
        while(A%B!=0){
             Long rem=A%B;
             A=B;
             B=rem;
        }
        
        ans[1]=B;
        ans[0]=(n1*n2)/ans[1];
        return ans;
    }
    
};
