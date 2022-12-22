package Math Algorithms;

import java.util.*;

public class Catalan_Numbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++)
        {
            arr[i] = 0;
            for(int j=0;j<i;j++)
                arr[i] += arr[j] * arr[i-1-j];
        }
        System.out.println(arr[n]);
    }
}
