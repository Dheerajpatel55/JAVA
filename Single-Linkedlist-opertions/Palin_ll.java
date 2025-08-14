
public class Palin_ll {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public boolean palinornot(){
    
        if(head==null || head.next==null){
            return true;
        }
        Node mid = palinMid();
        Node prev = null, curr = mid,next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left= left.next;
            right= right.next;
        }
        return true;

    }
    public Node palinMid(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Palin_ll ll = new Palin_ll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.display();
        System.out.println(ll.palinornot());

    }

}


