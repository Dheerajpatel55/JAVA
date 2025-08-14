public class LL_middle {

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

    public void addFirst(int data) {
        // step 1 = create a new node
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2 = Newnode.next = Head
        newnode.next = head;// head will be always starting point
        // step 3 head=newnode
        head = newnode;
    }

    public void addmiddle(int idx, int data) {
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1;temp->prev
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void display() {
        if (head == null) {
            System.out.print("LL is MT");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL_middle ll = new LL_middle();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addmiddle(1, 50);
        ll.display();
    }
}
