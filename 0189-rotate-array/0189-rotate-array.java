class Solution {
    public void reverse(int[] nums,int start,int n){
        int end=n-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k);
        reverse(nums,nums.length-k,nums.length);
        reverse(nums,0,nums.length);
    }
}