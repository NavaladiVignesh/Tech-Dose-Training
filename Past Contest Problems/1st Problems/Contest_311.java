package Past Contest Problems.1st Problems;

public class Contest_311 {
    public int smallestEvenMultiple(int n) {
        int lcm = 0;
        if(n%2==0){
            lcm = n;
        }
        else if(n%2!=0){
            lcm = 2*n;
        }
        return lcm;
    }
}
