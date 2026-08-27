class Solution {
    public boolean possible(int[] pos,int m,int gap){
        int ct=1,last=pos[0];
        for(int i=1;i<pos.length;i++){
            if(pos[i]-last>=gap){
                ct++;
                last=pos[i];
            }
            if(ct>=m)return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1,high=position[position.length-1]-position[0],ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(position,m,mid)){
                ans=mid;
                low=mid+1;
            }else high=mid-1;
        }
        return ans;
    }
}