public class Reverse_ll {
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
    int size;

    public void adding(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        Reverse_ll ll = new Reverse_ll();
        ll.adding(10);
        ll.adding(20);
        ll.adding(30);
        ll.adding(40);
        ll.adding(50);
        ll.display();
        ll.reverse();
        ll.display();

    }
}
