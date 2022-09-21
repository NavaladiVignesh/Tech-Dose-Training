package Beginers_Assingment;

import java.util.*;

public class Digits_In_Integer {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            long n = kb.nextLong();

            if (n == 0) {
                return;
            }
            while (n != 0) {
                long r = n % 10;
                n = n / 10;
                System.out.println(r + " ");
            }
        }
    }
}
