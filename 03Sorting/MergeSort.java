class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int i = l;
         int j = m+1;
         int new_arr[]=new int[(r-l+1)];
         for(int k = 0 ; k <(r-l+1);k++){
             if(i > m){
                 new_arr[k] = arr[j++]; 
             }else if(j > r){
                 new_arr[k] = arr[i++];
             }else if(arr[i]<arr[j]){
                 new_arr[k] = arr[i++];
             }else {
                 new_arr[k] = arr[j++];
             }
         }
         for(int  val :new_arr){
             arr[l++] = val;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r)return;
        int mid  = ( l + r ) / 2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
