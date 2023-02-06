class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
       insertionSort(arr,i);
       
  }
  //Function to sort the array using insertion sort algorithm.
 public static void insertionSort(int arr[], int n){
      
      for(int i=1;i<n;i++){
          int j= i;
          while(j>0){
              if(arr[j-1] >arr[j]){
                  swap(arr, j, j-1);
                  --j;
              }else{
                  break;
              }
          }
      }
 }
      
  public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
