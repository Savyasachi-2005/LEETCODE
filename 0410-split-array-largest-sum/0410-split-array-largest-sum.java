class Solution {
    public int ctPairs(int[] nums,int mx){
        int parti=1,subarr=0;
        for(int ele:nums){
            if(subarr+ele<=mx)subarr+=ele;
            else{
                parti++;
                subarr=ele;
            }
        }
        return parti;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE,high=0;
        for(int ele:nums){
            low=Math.max(low,ele);
            high+=ele;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int countPairs=ctPairs(nums,mid);
            if(countPairs>k)low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}