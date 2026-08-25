class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int ele:nums)xor^=ele;
        int diffBit=xor&(-xor);
        int a=0,b=0;
        for(int ele:nums){
            if((ele&diffBit)!=0)a^=ele;
            else b^=ele;
        }
        return new int[]{a,b};
    }
}