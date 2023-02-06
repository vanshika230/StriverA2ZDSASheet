class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int left=0, right=0;
        while(right<arr.length){
            if(arr[right]==0){
                right++;
            }
            else{
                swap(arr,left,right);
                left++;
                right++;
            }
        }
    }
    public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
