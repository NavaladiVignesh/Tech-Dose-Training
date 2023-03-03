package Heap;

public class Merge
K sorted
{

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode sorted = dummy;
        for (ListNode list : lists) {
            while (list != null) {
                heap.add(list);
                list = list.next;
            }
        }
        while (!heap.isEmpty()) {
            dummy.next = heap.poll();
            dummy = dummy.next;
            dummy.next = null;
        }
        return sorted.next;
    }
}
