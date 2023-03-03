public class Combination Sum 3
{

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[9];
        for(int i=0;i<9;i++){
            arr[i]=i+1;
        }
        toFindCombination(0,arr,list,0,k,n,new ArrayList<>());
        return list;
    }

    public static void  toFindCombination(int ind,int[] arr,List<List<Integer>> list,int sum,int k,int n,List<Integer> ds){
        if(ind==arr.length){
            if(sum==n && ds.size()==k)
                list.add(new ArrayList<>(ds));
            return;
        }
         
        ds.add(arr[ind]);
        sum+=arr[ind];
        toFindCombination(ind+1,arr,list,sum,k,n,ds);
        
        sum-=arr[ind];
        ds.remove(ds.size()-1);
        toFindCombination(ind+1,arr,list,sum,k,n,ds);
    }
}
