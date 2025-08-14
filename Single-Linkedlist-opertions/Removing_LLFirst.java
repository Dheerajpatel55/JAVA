public class Removing_LLFirst {
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

    public void addFirst(int data) {
        // step 1 = create a new node
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step 2 = Newnode.next = Head
        newnode.next = head;// head will be always starting point
        // step 3 head=newnode
        head = newnode;
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

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty Linkedlist");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if (size == 0) {
            System.out.println("Empty Linkedlist");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        size--; 
        tail = prev;
        return val;
    }

    public static void main(String[] args) {
        Removing_LLFirst ll = new Removing_LLFirst();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
        ll.removeFirst();
        ll.display();
        ll.removeLast();
        ll.display();
        System.out.println(size);
    }
}
