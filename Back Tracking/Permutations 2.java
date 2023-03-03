public class Permutations 2
{

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        toFindPermutation(nums, list, new ArrayList<>(), new boolean[nums.length]);
        return list;
    }

    public static void toFindPermutation(int[] arr, List<List<Integer>> list, List<Integer> ds, boolean[] used) {
        if (ds.size() == arr.length) {
            list.add(new ArrayList<>(ds));
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (used[i] || i > 0 && arr[i] == arr[i - 1] && !used[i - 1])
                    continue;

                used[i] = true;
                ds.add(arr[i]);

                toFindPermutation(arr, list, ds, used);

                used[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }
}
