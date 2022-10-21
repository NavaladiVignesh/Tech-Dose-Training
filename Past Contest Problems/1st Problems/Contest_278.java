package Past Contest Problems.1st Problems;

import java.util.ArrayList;
import java.util.List;

public class Contest_278 {
     public int findFinalValue(int[] nums, int original) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            list.add(nums[i]);
        while(true){
            if(list.contains(original))
                original*=2;
            else
                return original;
        }
    }
}
