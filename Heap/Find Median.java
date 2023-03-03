package Heap;

public class Find Median
{
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    boolean even=true;

    public MedianFinder() {
        left= new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (even) {
            right.offer(num);
            left.offer(right.poll());
        } else {
            left.offer(num);
            right.offer(left.poll());
        }
        even = !even;
    }

    public double findMedian() {
        if (even) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek();
        }
    }
}
