class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low>high){
            return;
        }
        int pivotIdx= partition(arr,arr[high],low,high);
        quickSort(arr,low,pivotIdx-1);
        quickSort(arr,pivotIdx+1,high);
    }
    static int partition(int arr[],int pivot, int lo, int hi)
    {
        // your code here
        int i=lo, j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j-1;
    }
    
     public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
