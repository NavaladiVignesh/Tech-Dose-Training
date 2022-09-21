package Bit_Manipulation;

import java.util.Arrays;

public class Majority_Element {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        return arr[len / 2];
    }
}
