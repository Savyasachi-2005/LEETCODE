class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        int left=0,ct=p.length();
        for(char ch:p.toCharArray())map.put(ch,map.getOrDefault(ch,0)+1);
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            int val=map.getOrDefault(ch,0);
            if(val>0)ct--;
            map.put(ch,val-1);
            if(right-left+1>p.length()){
                char leftChar=s.charAt(left);
                int leftVal=map.getOrDefault(leftChar,0);
                if(leftVal>=0)ct++;
                map.put(leftChar,leftVal+1);
                left++;
            }
            if(ct==0)ans.add(left);
        }
        return ans;
    }
}

// Bruteforce Solution
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> ans=new ArrayList<>();
//         int[] pct=new int[26];
//         for(char c:p.toCharArray())pct[c-'a']++;
//         for(int i=0;i<=s.length()-p.length();i++){
//             int[] sct=new int[26];
//             for(int j=i;j<i+p.length();j++)sct[s.charAt(j)-'a']++;
//             if(Arrays.equals(sct,pct))ans.add(i);
//         }
//         return ans;
//     }
// }