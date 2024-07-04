package geeks_for_geeks.mathematics.ap_and_gp;

public class sumOfGPSeries {
    public static void main(String[] args) {
        System.out.println(gpSum(2,2,4));
    }
    static int gpSum(int a,int r,int n){
        return (int)(a*(1-Math.pow(r,n))/(1-r));
    }
}
