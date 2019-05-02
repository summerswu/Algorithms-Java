class MinStack {
    
    private List<Integer> data;               // store elements

    
    /** initialize your data structure here. */
    public MinStack() {
        data = new ArrayList<>();
    }
    
    public void push(int x) {
        data.add(x);
    }
    
    public int top(){
        return data.get(data.size()-1);
    }
    
    public void pop() {
        data.remove(data.size() - 1);
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<data.size(); i++){
            min = Math.min(min,data.get(i));
        }
        return min;
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