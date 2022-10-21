package Past Contest Problems.1st Problems;

public class Contest_268 {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int i=0,j=n-1;
        while(colors[0]==colors[j]) j--;
        while(colors[n-1]==colors[i]) i++;
        return Math.max(n-i-1,j);
    }
}
