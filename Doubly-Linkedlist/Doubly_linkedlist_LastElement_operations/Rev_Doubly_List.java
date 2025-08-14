import java.util.Scanner;
public class Rev_Doubly_List {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head, tail;
    public static int size;
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            size++;
            return;
        }
        newnode.prev = tail;
        tail.next = newnode;
        tail = newnode;
        size++;
    }
    public void printing_order(int n){
        if(n==0){
            while(head!=null){
                System.out.print(head.data+"<->");
                head = head.next;
            }
            System.out.println("NULL");
        }
        else if(n==1){
            while(tail !=null){
                System.out.print(tail.data+"<->");
                tail =   tail.prev;
            }
            System.out.println("NULL");
        }
        else{
            System.out.println(Integer.MIN_VALUE+" \nChoose 0 for starting\n Choose 1 for ending:");
        }
    }
    public static void main(String[] args) {
        Rev_Doubly_List ll = new Rev_Doubly_List();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        
        Scanner sc = new Scanner(System.in);
        int order = sc.nextInt();
        System.out.println("Size of Linkedlist:"+size);

        ll.printing_order(order);
    }
}
