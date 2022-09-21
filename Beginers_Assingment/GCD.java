import java.util.*;

public class GCD {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            int gcd = 1;
            for (int i = 1; i <= x && i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    gcd = i;
                }
            }
            System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
        }
    }
}
