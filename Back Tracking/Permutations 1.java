public class Permutations 1
{

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        toFindPermutation(0, nums, list);
        return list;
    }

    public static void toFindPermutation(int ind, int[] arr, List<List<Integer>> list) {
        if (ind == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }

            list.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            swap(i, ind, arr);
            toFindPermutation(ind + 1, arr, list);
            swap(i, ind, arr);
        }
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
