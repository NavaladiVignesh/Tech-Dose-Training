package Bit_Manipulation;

public class Counting_Bits {
    public int[] countBits(int n) {
        int count[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            count[i] = count[i & (i - 1)] + 1;
        }
        return count;
    }
}
