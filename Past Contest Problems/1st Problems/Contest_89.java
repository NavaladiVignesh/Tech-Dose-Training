package Past Contest Problems.1st Problems;

public class Contest_89 {
    public int minimizeArrayValue(int[] nums) {
        long res=0,sum=0;
        int len=nums.length;
        for(int i=0;i<len;++i){
            sum+=nums[i];
            res=Math.max(res,(sum+i)/(i+1));
        }
        return (int)res;
    }
}
