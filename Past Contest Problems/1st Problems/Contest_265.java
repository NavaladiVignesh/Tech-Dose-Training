package Past Contest Problems.1st Problems;

public class Contest_265 {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
