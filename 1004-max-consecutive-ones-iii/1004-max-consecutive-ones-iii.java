class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,zero=0,n=nums.length;
        for(int right=0;right<n;right++){
            if(nums[right]==0)zero++;
            if(zero>k){
                if(nums[left]==0)zero--;
                left++;
            }
        }
        return n-left;
    }
}