import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt();
        int n2 = kb.nextInt();
        int lcm;
        lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }
}
