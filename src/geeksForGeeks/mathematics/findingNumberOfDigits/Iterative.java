package geeksForGeeks.mathematics.findingNumberOfDigits;

public class Iterative {
    public static void main(String[] args) {
        System.out.println(countDigit(-200));
    }
    static int countDigit(long n){
        int count=0;
        if (n==0){
            return 1;
        }else{
            if (n<0){
                n=n*-1;
            }
            while (n!=0){
                n=n/10;
                ++count;
            }
        }
        return count;
    }
}
