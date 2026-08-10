class Solution {
    public int expand(String s,int left,int right){
        int ct=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            ct++;
            left--;
            right++;
        }
        return ct;
    }
    public int countSubstrings(String s) {
        int left=0,right=s.length()-1;
        int ct=0;
        for(int i=0;i<s.length();i++){
            ct+=expand(s,i,i);
            ct+=expand(s,i,i+1);
        }
        return ct;
    }
}