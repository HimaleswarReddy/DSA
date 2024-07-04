package geeks_for_geeks.mathematics.gcd;

public class GCDwithRecursive {
    public static void main(String[] args) {
        System.out.println(gcd(12,15));
    }
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
