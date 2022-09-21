package Beginers_Assingment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int n = kb.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(arr[n - 2]);
        }
    }
}
