public class Recursive {
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
    public static int size;
    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        tail =newnode;
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    
    }
    public int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recsearch(int key){
        return helper(head,key);

    }
    public static void main(String[] args) {
        Recursive ll = new Recursive();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        System.out.println("size of LinkedList :"+size);
        // ll.display();
       System.out.println(ll.recsearch(40));
        

    }
    
}
