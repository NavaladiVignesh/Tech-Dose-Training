package Stack;

public class Implement
Stack using Queue
{
    ArrayDeque<Integer>q;

    public MyStack() {
        q=new ArrayDeque<>();
    }

    public void push(int x) {
        q.push(x);
    }

    public int pop() {
        return q.pop();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
