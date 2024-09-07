package apna.linked_list;
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {

        Node temp = head;

        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAt(int index, int data) {
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next.next;
        temp.next = newNode;
    }
    public void deleteFirst() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void deleteAt(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void deleteLast() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;

        }
    }

}
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insertFirst(10);
        list.insertAt(2, 9);


        list.display();
        list.deleteFirst();
        list.display();
        list.deleteAt(2);
        list.display();
        list.deleteLast();
        list.display();

    }

}
