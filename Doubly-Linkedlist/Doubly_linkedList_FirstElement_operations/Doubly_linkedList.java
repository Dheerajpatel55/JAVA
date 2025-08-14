public class Doubly_linkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head, tail;
    public static int size = 0;
//adding Node at first
    public void addFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;

    }
//priniting Linkedlist from head to tail
    public void printing() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    //Removing FIrst element
    public int removingFirst(){
        if(head == null){
            System.out.println("EMPTY DOUBLY LIST");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public static void main(String[] args) {
        Doubly_linkedList dll = new Doubly_linkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printing();
        System.out.println(size);
        dll.removingFirst();
        dll.printing();
        System.out.println(size);
    }

}
