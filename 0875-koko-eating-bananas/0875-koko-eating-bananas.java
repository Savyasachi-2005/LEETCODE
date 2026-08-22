class Solution {
    public int maxi(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        return  max;
    }
    public double totalH(int[] nums,int hr){
        int total=0;
        for(int i=0;i<nums.length;i++)total+=Math.ceil((double)nums[i]/(double)hr);
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int lw=0,hg=maxi(piles);
        int total;
        while(lw<=hg){
            int mid=lw+(hg-lw)/2;
            total=(int)totalH(piles,mid);
            if(total<=h)hg=mid-1;
            else lw=mid+1;
        }
        return lw;
    }
}