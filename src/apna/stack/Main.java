package apna.stack;

class Stack {
    static final int MAX = 1000;
    int[] a = new int[MAX];
    int top;

    public Stack() {
        this.top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }
    public boolean push(int data) {
        if (top >= MAX - 1) {
            return false;
        }
        a[++top] = data;
        return true;
    }
    public int pop() {
        if (top < 0) {
            return 0;
        }
        return a[top--];
    }
    public int peek() {
        if (top < 0) {
            return 0;
        }
        return a[top];
    }
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


}
public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
        System.out.println(s.pop());
        s.print();
        System.out.println(s.isEmpty());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
    }
}
