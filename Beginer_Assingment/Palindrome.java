import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            String str = kb.next();
            int l = 0;
            int flag = 1;
            int r = str.length() - 1;
            while (r-- > l++) {
                if (str.charAt(r) != str.charAt(l)) {
                    System.out.println("Not a palindrome");
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 1)
            System.out.println("Palindrome");
    }
}
