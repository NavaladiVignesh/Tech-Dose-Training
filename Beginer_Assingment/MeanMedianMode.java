import java.util.*;

public class MeanMedianMode {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int n = kb.nextInt();
            int[] arr = new int[n];
            Arrays.sort(arr);
            for (int i = 0; i < n; i++)
                arr[i] = kb.nextInt();
            double mean = 0.d;
            int mode, median;
            int[] hash = new int[1000];
            for (int i : arr) {
                hash[i]++;
                mean += i;
            }
            System.out.println(mean / n);
            if ((n & 1) != 1) {
                median = (arr[n / 2] + arr[(n / 2) - 1]) / 2;
            } else {
                median = arr[n / 2];
            }
            System.out.println(median);
            mode = Integer.MIN_VALUE;
            for (int i = 0; i < hash[arr.length - 1]; i++) {
                if (mode < hash[i])
                    mode = i;
            }
            System.out.println(mode);
        }
    }
}
