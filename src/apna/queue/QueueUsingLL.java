package apna.queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {

    Node head = null;
    Node tail = null;

    public void add(int data) {

        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void remove() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        if (tail == null) return true;
        return false;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class QueueUsingLL {

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());

        q.remove();
        q.remove();
        System.out.println(q.isEmpty());
    }

}
