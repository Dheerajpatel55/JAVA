public class IterativeSearch {
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
        
        public void add(int data){
            Node newnode = new Node(data);
            size++;
            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = tail= newnode;
        }
        public int display(int key){
            Node temp = head;
            for(int i=0;i<size;i++){
                if(temp.data == key){
                    return i;
                }
              temp= temp.next;
            }
            return -1;
        }
    
    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println(ll.display(30));
    }
}
