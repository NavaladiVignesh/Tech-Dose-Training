package Past Contest Problems.1st Problems;

public class Contest_281 {
    public int countEven(int num) {
        int cnt=0;
        for(int i=2;i<=num;i+=2){
            int sum=0;
            while(i!=0){
                sum+=i%10;
                i/=10;
            }
            if(sum%2==0) cnt++;
        }
        return cnt;
    }
}
