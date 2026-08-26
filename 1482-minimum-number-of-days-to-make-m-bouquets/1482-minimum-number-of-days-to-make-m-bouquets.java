class Solution {
    public boolean possible(int[] bloomDay,int day,int m,int k){
        int ct=0,noOfDays=0;
        for(int ele:bloomDay){
            if(ele<=day)ct++;
            else{
                noOfDays+=(ct/k);
                ct=0;
            }
        }
        noOfDays+=(ct/k);
        return (noOfDays>=m);
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        long fals=m*1L*k*1L;
        if(fals>bloomDay.length)return -1;
        for(int ele:bloomDay){
            low=Math.min(ele,low);
            high=Math.max(high,ele);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,mid,m,k))high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}