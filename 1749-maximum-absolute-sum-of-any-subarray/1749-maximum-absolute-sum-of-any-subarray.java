class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min_sum=0,min=0,max=0,max_sum=0;
        for(int ele:nums){
            max_sum=Math.max(ele,max_sum+ele);
            max=Math.max(max,max_sum);

            min_sum=Math.min(ele,min_sum+ele);
            min=Math.min(min,min_sum);
        }
        return Math.max(max,Math.abs(min));
    }
}