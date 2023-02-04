class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if(s.length() == 0) 
            return true;
        
        for(int i = 0, j = s.length()-1; i<=j; i++, j--){ 
            if(s.charAt(i) != s.charAt(j)) 
                return false;
        }

       return true; 
    }
}
