class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalG=0,curG=0,startIdx=0;
        for(int i=0;i<gas.length;i++){
            totalG+=gas[i]-cost[i];
            curG+=gas[i]-cost[i];
            if(curG<0){
                startIdx=i+1;
                curG=0;
            }
        }
        return totalG>=0?startIdx:-1;
    }
}