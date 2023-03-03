package Heap;

public class Sort Characters
{

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());
        System.out.println(maxHeap);
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char ch = maxHeap.remove();
            int count = map.get(ch);
            while (count != 0) {
                result.append(ch);
                count--;
            }
        }
        return result.toString();
    }
}
