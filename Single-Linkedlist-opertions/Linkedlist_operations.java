import java.util.*;

public class Linkedlist_operations {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;//to get the size of LL

    public void First(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void Last(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void Middle(int idx, int data) {
        if (idx == 0) {
            First(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        Linkedlist_operations ll = new Linkedlist_operations();
        System.out.println(
                "Choose your operations\n1.adding to first position\n2.adding to ending part\nIt also include adding at middle");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                ll.First(10);
                ll.First(20);
                ll.First(30);
                ll.First(40);
                ll.First(10);
                ll.First(20);
                ll.First(30);
                ll.First(40);
                ll.display();
                break;
            case 2:
                ll.Last(10);
                ll.Last(60);
                ll.Last(40);
                ll.Last(80);
                ll.display();
                break;
            default:
                System.out.println("Enter chey correct ga!");
        }
        // Collections.sort(ll);
        ll.Middle(1, 222222);
        ll.display();
        System.out.println(size);
        sc.close();
    }
}
