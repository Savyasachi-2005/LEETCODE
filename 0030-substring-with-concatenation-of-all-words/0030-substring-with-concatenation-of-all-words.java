class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String x:words)map.put(x,map.getOrDefault(x,0)+1);
        int n=s.length(),m=words.length,w=words[0].length();
        for(int i=0;i<w;i++){
            HashMap<String,Integer> temp=new HashMap<>();
            int ct=0;
            for(int j=i,k=i;j+w<=n;j=j+w){
                String word=s.substring(j,j+w);
                temp.put(word,temp.getOrDefault(word,0)+1);
                ct++;
                if(ct==m){
                    if(map.equals(temp))ans.add(k);
                    String rmv=s.substring(k,k+w);
                    temp.computeIfPresent(rmv,(a,b)->(b>1)?b-1:null);
                    ct--;
                    k=k+w;
                }
                
            }
        }
        return ans;
    }
}