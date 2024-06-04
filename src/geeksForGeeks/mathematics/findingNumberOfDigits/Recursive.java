package geeksForGeeks.mathematics.findingNumberOfDigits;

// This won't work out in case of input is "0"

public class Recursive {
    public static void main(String[] args) {
        System.out.println(countDigit(-1000));
    }
    static int countDigit(long n){
        if(n==0)
            return 0;
        return 1+countDigit(n/10);
    }
}
