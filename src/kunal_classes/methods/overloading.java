package kunal_classes.methods;

public class overloading {
    public static void main(String[] args) {
        sum(23);
        sum("nani");
        System.out.println(sum(23,45));
        System.out.println(sum(23,34,45));

    }
    static void sum(int a){
        System.out.println(a);
    }
    static void sum(String a){
        System.out.println(a);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a ,int b,int c){
        return a+b+c;
    }

}
