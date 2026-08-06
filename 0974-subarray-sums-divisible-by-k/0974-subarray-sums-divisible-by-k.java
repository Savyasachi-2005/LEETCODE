class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0,ct=0;
        int[] freq=new int[k];
        freq[0]=1;
        for(int ele:nums){
            sum+=ele;
            int rem=((sum%k)+k)%k;
            ct+=freq[rem];
            freq[rem]++;
        }
        return ct;
    }
}