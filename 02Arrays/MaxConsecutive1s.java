//BRUTE FORCE
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int ct=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ct++;
                ans.add(ct);
            }
            else{
                ct=0;
                ans.add(ct);
            }
        }
        return Collections.max(ans);
    }
}

// BRUTE FORCE 2
class Solution {
  
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        int curCount = 0;
        int maxCount = 0;

        for (int n : nums) {
            if (n == 1) {
                curCount++;
                maxCount = Math.max(maxCount, curCount);
            } else {
                curCount = 0;
            }
        }

        return maxCount;
    }
}
