package Past Contest Problems.1st Problems;

public class Contest_75 {
    public int triangularSum(int[] nums) {
        int len=nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                nums[j]=(nums[j]+nums[j+1])%10;
            }
        }
        return nums[0];
    }
}
