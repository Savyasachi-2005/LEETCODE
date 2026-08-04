class Solution {
    public String getHint(String s, String g) {
        int bull=0,cow=0;
        int[] sr=new int[10];
        int[] gu=new int[10];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==g.charAt(i))bull++;
            else {
                sr[s.charAt(i)-'0']++;
                gu[g.charAt(i)-'0']++;
            }
        }
        for(int d=0;d<10;d++){
            cow+=Math.min(sr[d],gu[d]);
        }
        return bull+"A"+cow+"B";
    }
}