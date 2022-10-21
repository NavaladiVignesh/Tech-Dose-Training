package Past Contest Problems.1st Problems;

public class Contest_86 {
    public boolean findSubarrays(int[] nums) {
        long len=nums.length;
        for(int i=0;i<len-1;i++){
            long sum=nums[i]+nums[i+1];
            for(int j=0;j<len-1;j++){
                if(i!=j){
                    if(sum==(nums[j+1]+nums[j])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
