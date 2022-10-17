package shilpa.leetcode;


import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element x onto stack.
    public void push(int x) {
        // Push x first in empty q2
        q2.add(x);

        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }

        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    // Removes the element on top of the stack.
    public void pop() {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.remove();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }
    int size() { return q1.size(); }

    public static void main(String[] args) {
        ImplementStackUsingQueues s = new ImplementStackUsingQueues();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
        System.out.println(s.empty());
    }
    /*
     Method2-
     class MyStack {
     ArrayDeque<Integer> q;
     public MyStack() {
     q=new ArrayDeque<>();
     }
     public void push(int x) {
     q.push(x);
     }

     public int pop() {
     return q.remove();
     }
     public int top() {
     return q.peekFirst();
     }
     public boolean empty() {
     return q.isEmpty();
     }
     }
     */
}
