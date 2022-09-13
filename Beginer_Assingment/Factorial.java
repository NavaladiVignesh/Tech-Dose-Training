import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int n = kb.nextInt();
            int[] fact = new int[n + 1];
            fact[0] = 1;
            for (int i = 1; i <= n; i++) {
                fact[i] = i * fact[i - 1];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(fact[i]);
            }
        }
    }
}
