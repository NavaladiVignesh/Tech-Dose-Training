package Bit_Manipulation;

public class Single_Number_II {
    public int singleNumber(int[] nums) {
        int result = 0, ctr = 0;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            result = (result ^ nums[i]) & (~ctr);
            ctr = (ctr ^ nums[i]) & (~result);
        }
        return result;
    }
}
