package apna.queue;


 class Queue1{
    int[] arr;
    int size;
    int rear;

    public Queue1(int size) {
        arr = new int[size];
        this.size = size;
        rear = -1;
    }

    public void add(int data) {
        if (rear == size -1) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    public int remove() {
        if(rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int front = arr[0];

        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear = rear - 1;
        return front;
    }

    public int peek() {
        if(rear == -1) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    public boolean isEmpty() {
        return rear == -1;
    }
}

public class QueueUsingArray {

    public static void main(String[] args) {
        Queue1 q = new Queue1(10);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
