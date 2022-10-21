package Past Contest Problems.1st Problems;

public class Contest_273 {
    public boolean isSameAfterReversals(int num) {
        if(num==0)
            return true;
        else{
            int rev=0,rev2=0;
            int number1=num;
            int rem1,rem2;
            while(number1!=0){
                rem1=number1%10;
                rev=rev*10+rem1;
                number1=number1/10;
            }
            int number2=rev;
            while(number2!=0){
                rem2=number2%10;
                rev2=rev2*10+rem2;
                number2=number2/10;
            }
            if(rev2==num) return true;
            else return false;

        }
    }
}
