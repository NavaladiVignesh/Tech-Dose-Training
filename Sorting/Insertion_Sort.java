package Sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i] = kb.nextInt();
        }

        for (int i = 1; i < numArray.length - 1; i++) {
            int temp = numArray[k];
            int j = i - 1;
            while (j >= 0 && temp <= numArray[j]) {
                numArray[j + 1] = numArray[j];
                j = j - 1;
            }
            numArray[j + 1] = temp;
        }

        System.out.println(Arrays.toString(numArray));
    }
}