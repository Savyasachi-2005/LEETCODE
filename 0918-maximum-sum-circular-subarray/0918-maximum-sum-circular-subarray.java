class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        for(int ele:nums)total+=ele;
        int min=nums[0];
        int max=nums[0];
        int min_sum=0,max_sum=0;
        for(int ele:nums){
            max_sum+=ele;
            max=Math.max(max,max_sum);
            if(max_sum<0)max_sum=0;
        }

        for(int ele:nums){
            min_sum+=ele;
            min=Math.min(min,min_sum);
            if(min_sum>0)min_sum=0;
        }
        if(max<0)return max;
        return Math.max(max,total-min);
    }
}