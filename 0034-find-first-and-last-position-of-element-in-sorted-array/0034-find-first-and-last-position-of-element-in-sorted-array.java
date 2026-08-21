class Solution {
    private int first(int[] nums,int left,int right,int target){
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }else if(nums[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
    private int last(int[] nums,int left,int right,int target){
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }else if(nums[mid]<target)left=mid+1;
            else right=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,0,nums.length-1,target),last(nums,0,nums.length-1,target)};
    }
}