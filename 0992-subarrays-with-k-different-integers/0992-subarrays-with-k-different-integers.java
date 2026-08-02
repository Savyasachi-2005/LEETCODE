class Solution {
    private int atMost(int[] nums,int k){
        int ct=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        for(int right=0;right<nums.length;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0)map.remove(nums[left]);
                left++;
            }
            ct+=right-left+1;
        }
        return ct;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ct1=atMost(nums,k);
        int ct2=atMost(nums,k-1);
        return ct1-ct2;
    }
}