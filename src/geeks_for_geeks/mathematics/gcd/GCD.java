package geeks_for_geeks.mathematics.gcd;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(10,5));
        System.out.println(gcd(9,10));
    }
    static int gcd(int a,int b){
        int res=Math.min(a,b);
        while(res>0){
            if(a%res==0&&b%res==0){
                break;
            }
            res--;
        }
        return res;
    }
}
