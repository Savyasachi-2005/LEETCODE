class Solution {
    public boolean isValid(int n,int t){
        int prod=1,x=n;
        if(x==0) return 0%t==0;
        while(x>0){
            prod*=(x%10);
            x/=10;
        }
        return prod%t==0;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(isValid(n,t))return n;
            n++;
        }
    }
}