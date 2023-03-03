public class Combination Sum 2
{

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        toFindCombiantion(0,candidates,target,list,new ArrayList<>());
        return list;
    }

    public static void toFindCombiantion(int ind,int[] arr,int target,List<List<Integer>> list,List<Integer> ds){
        if(target==0){
            list.add(new ArrayList<>(ds));
        }
        
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])
                continue;
            if(arr[i]>target)
                break;
            
            ds.add(arr[i]);
            toFindCombiantion(i+1,arr,target-arr[i],list,ds);
            ds.remove(ds.size()-1);
        }
    }
}
