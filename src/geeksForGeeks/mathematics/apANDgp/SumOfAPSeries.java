package geeksForGeeks.mathematics.apANDgp;

public class SumOfAPSeries {
    public static void main(String[] args) {
        System.out.println(apSum(2,2,10));
    }
    static int apSum(int a,int d,int n){
        int sum=n*(2*a+(n-1)*d)/2;
        return sum;
    }
}
