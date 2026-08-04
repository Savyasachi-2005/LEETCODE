class Solution {
    public String getHint(String s, String g) {
        int bull=0,cow=0;
        int[] freq=new int[10];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==g.charAt(i))bull++;
            else freq[g.charAt(i)-'0']++;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=g.charAt(i)){
                if(freq[s.charAt(i)-'0']>0){
                    cow++;
                    freq[s.charAt(i)-'0']--;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        sb.append(bull).append("A").append(cow).append("B");
        return sb.toString();
    }
}