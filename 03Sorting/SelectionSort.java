
class Solution
{
	int  select(int arr[], int m)
	{
        // code here such that selectionSort() sorts arr[]
        for(int i=0;i<arr.length;i++){
            int minIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            swap(arr,i,minIdx);
        }
        return 0;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    select(arr,n);
	}
	public static void swap(int arr[], int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
