class MyStack {
    private Queue<Integer> first;

    public MyStack() {
        first=new LinkedList<>();
    }
    
    public void push(int x) {
        first.add(x);
    }
    
    public int pop() {
        int n=first.size();
        for(int i=0;i<n-1;i++){
            first.add(first.remove());
        }
        return first.remove();
    }
    
    public int top() {
        int n=first.size();
        for(int i=0;i<n-1;i++){
            first.add(first.remove());
        }
        int peek=first.remove();
        first.add(peek);
        return peek;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */