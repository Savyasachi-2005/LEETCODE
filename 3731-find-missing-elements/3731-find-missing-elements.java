class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        int min=nums[0],max=nums[0];
        for(int ele:nums){
            min=Math.min(ele,min);
            max=Math.max(ele,max);
        }
        int[] arr=new int[max+1];
        for(int ele:nums){
            arr[ele]++;
        }
        for(int i=min;i<max;i++){
            if(arr[i]==0)ans.add(i);
        }
        return ans;
    }
}