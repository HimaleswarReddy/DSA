package geeks_for_geeks.mathematics.gcd;

public class GCDwithEuclidean {
    public static void main(String[] args) {
        System.out.println(gcd(12,15));
    }
    static int gcd(int a,int b){
        while(a!=b){
            if (a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }
}
