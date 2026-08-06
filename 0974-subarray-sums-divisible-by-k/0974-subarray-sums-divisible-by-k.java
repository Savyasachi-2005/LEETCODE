class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ct=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remind=(sum%k+k)%k;
            if(map.containsKey(remind)){
                ct+=map.get(remind);
            }
            map.put(remind,map.getOrDefault(remind,0)+1);
        }
        return ct;
    }
}