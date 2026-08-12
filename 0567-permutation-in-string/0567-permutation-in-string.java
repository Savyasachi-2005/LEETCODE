class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length(),n2=s2.length();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        if(n1>n2)return false;
        for(char ele:s1.toCharArray())freq1[ele-'a']++;
        int left=0;
        for(int right=0;right<n2;right++){
            freq2[s2.charAt(right)-'a']++;
            if(right-left+1>n1){
                freq2[s2.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1==n1){
                boolean isMatch=true;
                for(int i=0;i<26;i++){
                    if(freq1[i]!=freq2[i]){
                        isMatch=false;
                        break;
                    }
                }
                if(isMatch)return true;
            }
        }
        return false;
    }
}