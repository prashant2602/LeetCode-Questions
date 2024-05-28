class Solution {
    public int evalRPN(String[] tokens) {
        int a,b;
        Stack<Integer> S = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")){
                S.add(S.pop()+S.pop());
            }
            else if(s.equals("-")){
                a=S.pop();
                b=S.pop();
                S.add(b-a);
            }
            else if(s.equals("*")){
                S.add(S.pop()*S.pop());
            }
            else if(s.equals("/")){
                a=S.pop();
                b=S.pop();
                S.add(b/a);
            }
            else{
                S.add(Integer.parseInt(s));
            }
        }
        return S.pop();
    }
}
