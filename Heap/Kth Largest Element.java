package Heap;

public class Kth
Largest Element
{
    int k;
    PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        heap = new PriorityQueue<>();
        
        for(int n:nums){
            heap.offer(n);
        }
        while(heap.size()>k){
            heap.poll();
        }
    }

    public int add(int val) {
        heap.offer(val);
        while (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }
}
