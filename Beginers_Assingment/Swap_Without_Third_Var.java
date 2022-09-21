import java.util.*;

public class Swap_Without_Third_Var {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Normal swap:" + a + "," + b);
        }
    }
}
