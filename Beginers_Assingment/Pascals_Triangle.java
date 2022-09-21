import java.util.*;

public class Pascals_Triangle {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int n = kb.nextInt();
            int[][] pascals = new int[n + 1][n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == j)
                        pascals[i][j] = 1;
                    else
                        pascals[i][j] = pascals[i - 1][j] + pascals[i - 1][j - 1];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= (n - i); j++)
                    System.out.print(" ");
                for (int j = 0; j <= i; j++)
                    System.out.print(pascals[i][j] + " ");
                System.out.println();
            }
        }
    }
}
