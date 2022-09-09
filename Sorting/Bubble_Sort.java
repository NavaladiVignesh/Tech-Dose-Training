package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int intArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = kb.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }
}
