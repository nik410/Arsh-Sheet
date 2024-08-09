 public static void push_back_pb(ArrayDeque<Integer> dq, int x) {
    dq.offerLast(x);
}

// Function to pop element from back of the deque.
  public static void pop_back_ppb(ArrayDeque<Integer> dq) {
    dq.pollLast();
}

// Function to return element from front of the deque.
  public static int front_dq(ArrayDeque<Integer> dq) {
      if(dq.isEmpty())return -1;
      return dq.peekFirst();
}

// Function to push element x to the front of the deque.
  public static void push_front_pf(ArrayDeque<Integer> dq, int x) {
    dq.offerFirst(x);
}
