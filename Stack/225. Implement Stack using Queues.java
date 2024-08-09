class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    public void push(int x) {
        q1.offer(x);
    }
    
    public int pop() {
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }

        System.out.println(q2+ " :Q2" + q1 +" :Q1");

        int popEle = q1.poll();

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        return popEle;
    }
    
    public int top() {
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }

        int peekEle = q1.poll();


        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

        q1.offer(peekEle);

        return peekEle;
    }
    
    public boolean empty() {
        if(q1.size() == 0)return true;
        return false;
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
