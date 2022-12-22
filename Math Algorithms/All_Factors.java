package Math

Algorithms;

import java.util.Scanner;

public class All_Factors {
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();for(
    int i = 1;i<=n;i++)
    {
        if (n % i == 0) {
            System.out.println(i + " ");
        }
    }
}
