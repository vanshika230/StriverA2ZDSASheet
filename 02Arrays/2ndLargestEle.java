class Solution {
    
     int print2largest(int arr[], int n) {
        int largest=arr[0]; 
        int secondlar=-1;
        for(int i=1;i<n;i++)

    {
       if(arr[i]>largest)
        {
             secondlar=largest;
             largest=arr[i];

        }
        if(arr[i]<largest && arr[i]>secondlar)
        secondlar=arr[i];
    }
    return secondlar;
    }
}
