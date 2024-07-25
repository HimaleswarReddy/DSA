package geeks_for_geeks.mathematics.lcm;

public class LcmUsingGcd {
    public static void main(String[] args) {
        System.out.println(lcm(3,7));
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
