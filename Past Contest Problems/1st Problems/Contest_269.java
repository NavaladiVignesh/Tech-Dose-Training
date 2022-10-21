package Past Contest Problems.1st Problems;

public class Contest_269 {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                res.add(i);
        }
        return res;
    }
}
