public class Remove_Nth {
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
    public static int size;

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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void nth(int n) {
        if (n == size) {
            head = head.next;
            return;
        }
    
        Node prev = head;
        for (int i = 1; i < (size - n); i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]) {
        Remove_Nth ll = new Remove_Nth();
        ll.adding(10);
        ll.adding(20);
        ll.adding(30);
        ll.adding(40);
        ll.adding(50);
        ll.display();
        System.out.println("size: " + size);
        ll.nth(2);
        ll.display();

    }
}
