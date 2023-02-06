class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
      // search
      int i = 0;
      int j = matrix[0].length - 1;
        
      while(i < matrix.length && j >= 0){
         if(target == matrix[i][j]){
            return true;
         } else if(target > matrix[i][j]){
            i++;
         } else {
            j--;
         }
      }

     return false;
   }
    }
 
