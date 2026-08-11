class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxLen=0;
        int[] position=new int[128];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            left=Math.max(left,position[ch]);
            maxLen=Math.max(maxLen,right-left+1);
            position[ch]=right+1;
        }
        return maxLen;
    }
}