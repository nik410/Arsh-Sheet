import java.util.* ;
import java.io.*; 
class Queue {
	// Stacks to be used in the operations.
	Stack<Integer> stk1, stk2;

	public Queue() {
		// Intialise here.
		stk1 = new Stack();
		stk2 = new Stack();
	}

	// Enqueues 'X' into the queue. Returns true after enqueuing.
	public boolean enqueue(int x) {
		stk1.push(x);
		return true;
	}
	/*
	   Dequeues top element from queue. Returns -1 if the queue is empty, 
	   otherwise returns the popped element.
	*/
	public int dequeue() {
		if(stk1.size() == 0)return -1;
		else{
			while(!stk1.isEmpty()){
				stk2.push(stk1.pop());
			}

			int eleDeq = stk2.pop();

			while(!stk2.isEmpty()){
				stk1.push(stk2.pop());
			}

			return eleDeq;
		}
	}
};
