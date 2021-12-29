class MinStack {
      ArrayList<Integer> stack;    
    ArrayList<Integer> min;

    int top;
    int minVal;
    public MinStack() {
        stack = new ArrayList<>();
        top = -1;
        min = new ArrayList<>();
        minVal = Integer.MAX_VALUE;
    }
    public void push(int val) {
        top++;
        stack.add(val);
        if(top==0||minVal>val){
            minVal = val;
            min.add(minVal);
        }
        else{
            min.add(minVal);
        }
    }    
    public void pop() {
        stack.remove(top);
        min.remove(top);
        top--;
        if(top>-1) minVal = min.get(top);
    }
    
    public int top() { 
        return stack.get(top);
    }
    
    public int getMin() {
        return min.get(top);
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