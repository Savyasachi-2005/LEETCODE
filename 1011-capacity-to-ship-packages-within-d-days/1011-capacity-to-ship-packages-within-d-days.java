class Solution {
    public int findDays(int[] arr,int cap){
        int day=0,load=0;
        for(int ele:arr){
            if(ele+load>cap){
                day++;
                load=ele;
            }else load+=ele;
        }
        day++;
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0;
        for(int ele:weights){
            high+=ele;
            low=Math.max(low,ele);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int day=findDays(weights,mid);
            if(day<=days)high=mid-1;
            else low=mid+1;
        }
        return low;
    }
}