class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==K){
                ans=1;
            }
           
        }
       return ans; 
        
    }
}
