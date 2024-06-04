package geeksForGeeks.mathematics.apANDgp;

public class AP {
    public static void main(String[] args) {
        ap(2,2,10);
    }
    static void ap(int a,int d,int n){
        for (int i = 0; i < n; i++) {
            System.out.print((a+d*i)+" ");
        }
    }
}
