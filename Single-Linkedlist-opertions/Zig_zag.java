public class Zig_zag {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addata(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void breakingLL() {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        Node nextl, nextr;
        while(right!=null && left!=null){
            nextl=left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;
            left = nextl;
            right= nextr;
        }
        // Node dummy = new Node(0);
        // Node temp = dummy;
        // boolean flag = true;
        // while (right != null && left != null) {
        //     if (flag) {
        //         temp.next = left;
        //         left = left.next;
        //     } else {
        //         temp.next = right;
        //         right = right.next;
        //     }
        //     temp = temp.next;
        //     flag = !flag;
        // }
        // if (left != null) {
        //     temp.next = left;
        // } else if (right != null) {
        //     temp.next = right;
        // }
        // dummy = dummy.next;
        // head = dummy;

    }

    public static void main(String[] args) {
        Zig_zag ll = new Zig_zag();
        ll.addata(1);
        ll.addata(2);
        ll.addata(3);
        ll.addata(4);
        ll.addata(5);
        ll.display();
        ll.breakingLL();
        ll.display();
    }
}
