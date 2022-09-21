package Bit_Manipulation;

public class Decode_XOR_Permutation {
    public int[] decode(int[] encoded) {
        int index = 0;
        int len = encoded.length + 1;

        for (int i = 1; i <= len; i++) {
            index ^= i;
        }

        for (int i = 1; i < len - 1; i += 2) {
            index ^= encoded[i];
        }

        int[] permutation = new int[len];
        permutation[0] = index;

        for (int i = 0; i < len - 1; i++) {
            permutation[i + 1] = permutation[i] ^ encoded[i];
        }

        return permutation;
    }
}
