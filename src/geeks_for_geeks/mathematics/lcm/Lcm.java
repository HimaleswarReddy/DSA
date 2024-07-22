package geeks_for_geeks.mathematics.lcm;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(lcm(10,12));
    }
    static int lcm(int a,int b){
        int res=Math.max(a,b);
        while(true){
            if(res%a==0&&res%b==0){
                return res;
            }
            res++;
        }
    }
}
