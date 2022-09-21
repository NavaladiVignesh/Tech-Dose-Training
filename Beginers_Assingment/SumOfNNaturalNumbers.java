package Beginers_Assingment;

import java.util.*;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int n = kb.nextInt();
            int ans = 0;
            for (int i = 1; i <= n; i++)
                ans += i;
            System.out.println(ans);
        }
    }
}
