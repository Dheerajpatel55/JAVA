import java.util.*;
public class LLaddingLast {
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

        public void addlast(int data) {
            /*
             * 1.create a node(newnode)
             * 2.tail.next = newnode
             * 3.tail = newnode
             */
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;

        }
    public void display(){
        if(head ==null){
            System.out.print("LL is MT");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
System.out.println("NULL");
    }

    public static void main(String[] args) {
        LLaddingLast ll = new LLaddingLast();
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter how many elements do you want:");
       int size=sc.nextInt();
       for(int i=0;i<size;i++){
        //int value=sc.nextInt();
        ll.addlast(sc.nextInt());
       }
        ll.display();
        sc.close();
    }
    
}
