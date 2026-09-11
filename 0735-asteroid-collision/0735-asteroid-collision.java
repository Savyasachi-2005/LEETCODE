class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for(int ast:asteroids){
            boolean dest=false;
            while(!stk.isEmpty() && ast<0 && stk.peek()>0){
                if(stk.peek()<-ast){
                    stk.pop();
                    continue;
                }else if(stk.peek() == -ast){
                    stk.pop();
                    dest=true;
                    break;
                }else{
                    dest=true;
                    break;
                }
            }
            if(!dest){
                stk.push(ast);
            }
        }
        int[] res=new int[stk.size()];
        for(int i=stk.size()-1;i>=0;i--){
            res[i]=stk.pop();
        }
        return res;
    }
}