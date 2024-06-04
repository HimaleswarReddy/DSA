package geeksForGeeks.mathematics.findingNumberOfDigits;

public class Logarithimic {
    public static void main(String[] args) {
        System.out.println(countdigit(-100));
    }
    static int countdigit(long n){
        if (n==0){
            return 1;
        }if(n<0){
            n *= -1;
        }
        return (int)Math.floor(Math.log10(n)+1);
    }
}
