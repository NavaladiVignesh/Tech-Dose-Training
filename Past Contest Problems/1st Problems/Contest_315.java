package Past Contest Problems.1st Problems;

public class Contest_315 {
    public int findMaxK(int[] nums) {
        int len=nums.length;
        int max=0;
        int print=0;
        
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                for(int j=0;j<len;j++){
                    if(i!=j && nums[j]<0 && Math.abs(nums[j])==nums[i]){
                        if(nums[i]>max){
                            max=nums[i];
                            print=1;
                        }
                    }
                }
            }
        }
        if(print==0){
            return -1;
        }
        
        return max;
    }
}
