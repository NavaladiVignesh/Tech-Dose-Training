package Past Contest Problems.1st Problems;

public class Contest_308 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for(int i = 1;i  <nums.length;i++){
            nums[i] += nums[i-1];
        }
        int[] ans = new int[queries.length];
        for(int j = 0;j < queries.length;j++){
            int q = queries[j];
            for(int i = nums.length-1;i >= 0;i--){
                if(nums[i] <= q){
                    ans[j] = i+1;
                    break;
                }
            }
        }
        return ans;
    }
}
