class Solution {
    public boolean uniformArray(int[] nums1) {
        final int inf=Integer.MAX_VALUE;
        int minodd=inf;
        for(int ele:nums1){
            if(ele%2==1)minodd=Math.min(ele,minodd);
        }
        for(int ele:nums1){
            if(ele%2==0 && minodd!=inf && ele<minodd)return false;
        }
        return true;
    }
}