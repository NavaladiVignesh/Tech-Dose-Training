package Past Contest Problems.1st Problems;

public class Contest_279 {
    public int[] sortEvenOdd(int[] nums) {
        int len=nums.length;
        int temp=0;
        for(int i=1;i<len;i+=2){
            for(int j=i+2;j<len;j+=2){
                if(nums[i]<nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<len;i+=2){
            for(int j=i+2;j<len;j+=2){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
