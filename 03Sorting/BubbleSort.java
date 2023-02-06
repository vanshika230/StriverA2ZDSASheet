class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
       for(int i=n-1;i>0;i--){
           for(int j=0;j<i;j++){
               if(arr[j+1]<arr[j]){
                   swap(arr,j,j+1);
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
