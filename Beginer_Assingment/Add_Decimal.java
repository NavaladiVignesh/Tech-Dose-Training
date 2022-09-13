import java.util.*;

public class Add_Decimal {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            double n = kb.nextDouble();
            int val = kb.nextInt();
            System.out.printf(".1f", n + val);
        }
    }
}
