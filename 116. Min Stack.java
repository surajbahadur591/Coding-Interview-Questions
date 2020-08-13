class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
        
    
    }
    
    public void push(int x) {
        stack.push(x);
        if(minstack.isEmpty()){
            minstack.push(x);
        }
        else {
            minstack.push(Math.min(minstack.peek(), x));
        }
        
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */