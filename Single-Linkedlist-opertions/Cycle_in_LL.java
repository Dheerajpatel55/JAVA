public class Cycle_in_LL {
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

        public void addata(int data){
            Node newnode = new Node(data);
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }
        public boolean checkcycle(){
          Node slow = head;
          Node fast = head;
          while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast== slow){
                return true;
            }
          }
          return false;
        }
    
    public static void main(String[] args) {
        Cycle_in_LL ll = new Cycle_in_LL();
        ll.addata(1);
        ll.addata(2);
        ll.addata(3);
        ll.addata(4);
        ll.addata(5);
       //  tail.next = head;
        if(ll.checkcycle()==true){
            System.out.println("Big cycle found LL");
        }
        else{
            System.out.println("chaa No cycle found in LL");
        }
    }
}
