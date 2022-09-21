package Beginers_Assingment;

import java.util.*;

public class Perfect_Square {
    public static void main(String args[]) {
        try (Scanner kb = new Scanner(System.in)) {
            int a, b, c, d;
            a = kb.nextInt();
            b = kb.nextInt();
            c = kb.nextInt();
            d = kb.nextInt();
            if (a == b && b == c && c == d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}