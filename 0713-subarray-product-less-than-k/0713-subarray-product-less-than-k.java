class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ct=0;
        int start=0;
        int product=1;
        for(int end=0;end<nums.length;end++){
            product*=nums[end];
            while(start<=end && product>=k)product/=nums[start++];
            ct+=end-start+1;
        }
        return ct;
    }
}