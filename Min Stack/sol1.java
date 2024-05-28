class MinStack {
    Stack<Integer> S ;
    public MinStack() {
        S = new Stack<>();
    }
    
    public void push(int val) {
        S.add(val);
    }
    
    public void pop() {
        S.pop();
    }
    
    public int top() {
        return S.peek();
    }
    
    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(Integer a : S){
            if(a<min){
                min=a;
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
