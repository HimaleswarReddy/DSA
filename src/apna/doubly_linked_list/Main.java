package apna.doubly_linked_list;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head = null;
    Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        if (head == null) {
            return;
        }

        Node temp = head;
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
        } else {
            head.prev = newNode;
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

        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next.prev = newNode;

    }

    public void displayReverse() {
        Node temp = tail;

        if (tail == null) {
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (tail == null) {
            return;
        }
        if (tail.prev == null) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }

    public void deleteAt(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public int length() {
        Node temp = head;

        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.display();

        list.insertFirst(10);
        list.insert(5);
        list.display();

        list.insertAt(2, 6);
        list.display();
        list.displayReverse();

        list.deleteFirst();
        list.display();
        list.displayReverse();
        list.deleteLast();

        list.display();

        list.deleteAt(1);
        list.display();
        list.displayReverse();

        System.out.println(list.length());

    }
}
