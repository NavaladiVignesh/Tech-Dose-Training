package Array;

public class Garden_Workers {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 11, 12 };
        int workers = 3;
        int min_value = arr[0], max_value = 0;
        for (int n : arr) {
            min_value = Math.max(min_value, n);
            max_value += n;
        }
        int low = min_value, high = max_value;
        while (lo <= hi) {
            int mid = low + (high - low) / 2;
            if (check(arr, workers, mid)) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
        System.out.println(min_value + " - " + max_value);
        System.out.println(low);
    }

    static boolean check(int[] gardens, int workers, int ability) {
        int t = ability;
        for (int n : gardens) {
            if (t < n) {
                if (workers == 1)
                    return false;
                t = ability;
                workers--;
            }
            if (t >= n)
                t -= n;
            else
                return false;
        }
        return true;
    }
}
