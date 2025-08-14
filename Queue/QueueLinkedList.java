
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue class using Linked List
class QueueLL {
    private Node head, tail;

    public QueueLL() {
        this.head = this.tail = null;
    }

    // Enqueue (Add an element to the tail)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Dequeue (Remove an element from the head)
    public int dequeue() {
        if (head == null) {
            tail = null;
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    // Peek (Get the head element without removing)
    public int peek() {
        if (head == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return head.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (head == null);
    }

    // Display queue elements
    public void display() {
        if (head == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = head;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Driver Code
public class QueueLinkedList {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: Queue: 10 20 30

        System.out.println("Dequeued: " + queue.dequeue()); // Output: Dequeued: 10
        queue.display(); // Output: Queue: 20 30

        System.out.println("head Element: " + queue.peek()); // Output: head Element: 20

        queue.enqueue(40);
        queue.display(); // Output: Queue: 20 30 40
    }
}
