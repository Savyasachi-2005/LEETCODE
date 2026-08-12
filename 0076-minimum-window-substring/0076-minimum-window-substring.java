class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[128];
        for(char c:t.toCharArray())freq[c]++;
        int min=Integer.MAX_VALUE;
        int ct=t.length(),left=0,start=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0)ct--;
            freq[ch]--;
            while(ct==0){
                int len=right-left+1;
                if(len<min){
                    min=len;
                    start=left;
                }
                char leftChar=s.charAt(left);
                freq[leftChar]++;
                if(freq[leftChar]>0)ct++;
                left++;
            }
        }
        return min==Integer.MAX_VALUE ? "":s.substring(start,start+min);
    }
}