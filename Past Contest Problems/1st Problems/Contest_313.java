package Past Contest Problems.1st Problems;

public class Contest_313 {
    public int commonFactors(int a, int b) {
        int count = 1;
        for(int i=2;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
                count ++;
        }
        return count;
    }
}
