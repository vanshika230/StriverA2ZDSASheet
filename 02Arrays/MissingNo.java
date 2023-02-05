class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)
            return i;
            
        }

        return nums.length;
    }
}

public int missingNumber(int[] nums) {
    int n = nums.length ;
    int max_sum = (n*(n+1)/2);
    int sum = 0 ;
    for(int elem : nums){
        sum+=elem;
    }
    return max_sum-sum;
}
