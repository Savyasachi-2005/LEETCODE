class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String ele:tokens){
            if(ele.equals("+") || ele.equals("-") || ele.equals("*") || ele.equals("/")){
                int b=st.pop();
                int a=st.pop();
                switch(ele){
                    case "+":
                        st.push(a+b);
                        break;
                    case "-":
                        st.push(a-b);
                        break;
                    case "*":
                        st.push(a*b);
                        break;
                    case "/":
                        st.push(a/b);
                        break;
                }
            }else {
                st.push(Integer.parseInt(ele));
            }
        }
        return st.pop();
    }
}