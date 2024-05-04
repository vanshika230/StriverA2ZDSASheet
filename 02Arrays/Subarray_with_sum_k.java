class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int currsum=0;
        int ct=0;
        mp.put(0, 1);
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            int rem= currsum-k;
            if (mp.containsKey(rem)) {
                ct += mp.get(rem);
            }
            mp.put(currsum, mp.getOrDefault(currsum, 0) + 1);

        }
        return ct;
    }
}
