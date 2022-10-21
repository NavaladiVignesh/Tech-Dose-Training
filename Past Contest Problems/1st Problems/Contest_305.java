package Past Contest Problems.1st Problems;

import java.util.HashSet;
import java.util.Set;

public class Contest_305 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt=0;
        Set<Integer> res=new HashSet<>();
        for(int i:nums){
            if(res.contains(i-diff)&&res.contains(i-2*diff))
                cnt++;
            res.add(i);
        }
        return cnt;
    }
}
