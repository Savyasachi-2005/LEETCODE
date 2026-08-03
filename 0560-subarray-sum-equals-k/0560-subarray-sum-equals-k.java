class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        int presum=0,cnt=0;
        ans.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            int remove=presum-k;
            cnt+=ans.getOrDefault(remove,0);
            ans.put(presum,ans.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}