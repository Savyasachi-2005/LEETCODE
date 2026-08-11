class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] pct=new int[26];
        for(char c:p.toCharArray())pct[c-'a']++;
        for(int i=0;i<=s.length()-p.length();i++){
            int[] sct=new int[26];
            for(int j=i;j<i+p.length();j++)sct[s.charAt(j)-'a']++;
            if(Arrays.equals(sct,pct))ans.add(i);
        }
        return ans;
    }
}