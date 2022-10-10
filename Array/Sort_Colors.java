package Array;

public class Sort_Colors {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for (int n : nums)
            arr[n]++;
        arr[1] += arr[0];
        arr[2] += arr[1];
        int[] out = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            out[--arr[nums[i]]] = nums[i];
        }
        for (int i = 0; i < nums.length; i++)
            nums[i] = out[i];
    }

    void sort(int[] nums) {
        int[] arr = new int[3];
        for (int n : nums)
            arr[n]++;
        int index = 0;
        for (int i = 0; i <= 2; i++) {
            while (arr[i] != 0) {
                nums[index++] = i;
                arr[i]--;
            }
        }
    }
}
