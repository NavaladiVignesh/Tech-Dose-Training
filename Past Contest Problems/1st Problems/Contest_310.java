package Past Contest Problems.1st Problems;

public class Contest_310 {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new TreeMap();
        for(int i: nums){
            if(i%2==0){
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
        int maxElement = -1;
        int FreqEven = -1;
        for(int i: map.keySet()){
            if(maxElement<map.get(i)){
                maxElement = map.get(i);
                FreqEven = i;
            }
        }
        return FreqEven;
    }
}
