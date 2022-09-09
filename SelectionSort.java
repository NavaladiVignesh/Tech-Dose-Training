package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int n = kb.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                int index = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[index] > arr[j]) {
                        index = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
