class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=0,left=0,n=nums.length,ans=Integer.MAX_VALUE,sum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(left<=right && sum>=target){
                ans=Math.min(ans,right-left+1);
                sum-=nums[left++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}