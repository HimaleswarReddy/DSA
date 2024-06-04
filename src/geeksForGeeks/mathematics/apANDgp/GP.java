package geeksForGeeks.mathematics.apANDgp;

public class GP {
    public static void main(String[] args) {
        gp(2,2,10);
    }
    static void gp(int a,int r,int n){
        for (int i = 0; i < n; i++) {
            System.out.print((int)(a*Math.pow(r,i))+" ");
        }
    }
}
