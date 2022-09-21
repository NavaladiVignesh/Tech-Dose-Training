package Beginers_Assingment;

import java.util.*;

public class Frequency_Of_Char {
    public static void main(String args[]) {
        try (Scanner kb = new Scanner(System.in)) {
            String str = kb.nextLine();
            int len = str.length();
            int count[] = new int[26];

            for (int i = 0; i < len; i++) {
                count[(int) (str.charAt(i) - 'a')]++;
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    System.out.println((char) ('a' + i) + " " + count[i]);
                }
            }
        }
    }
}
