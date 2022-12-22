package Math Algorithms;

public class GCD {
    static int Gcd(int x,int y){
        if(x==0)
            return y;
        return Gcd(y%x,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find a GCD:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Gcd(a,b));
    }
}
