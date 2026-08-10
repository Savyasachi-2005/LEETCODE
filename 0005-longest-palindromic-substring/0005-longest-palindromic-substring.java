class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int initial=0,maxLen=0;
        for(int i=0;i<s.length();i++){
            int left=i,right=i;
            while(right<n-1 && s.charAt(right)==s.charAt(right+1))right++;
            while(left>0 && right<n-1 && s.charAt(left-1)==s.charAt(right+1)){
                left--;
                right++;
            }
            int curLen=right-left+1;
            if(curLen>maxLen){
                maxLen=curLen;
                initial=left;
            }
        }
        return s.substring(initial,initial+maxLen);
    }
}