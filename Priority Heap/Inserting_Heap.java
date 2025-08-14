import java.util.*;
public class Inserting_Heap {
    static class Heap{
        ArrayList<Integer> arr =new ArrayList<>();
        public void addLast(int data){
            arr.add(data);
            int lastNode =arr.size()-1;
            int parent = (lastNode-1)/2;

            while(arr.get(lastNode)<arr.get(parent)){   //O(log n)
                int temp =arr.get(lastNode);
                arr.set(lastNode,arr.get(parent));
                arr.set(parent,temp);
                lastNode=parent;
                parent=(lastNode-1)/2;
            }
        }
        public int topElement(){
            return arr.get(0);
        }
        public void printHeap() {
            System.out.println("Heap: " + arr);
            System.out.println("Size of Heap:"+arr.size());
        }
    }
    public static void main(String args[]){
    Heap hp = new Heap();
    hp.addLast(5);
    hp.addLast(3);
    hp.addLast(1);
    hp.addLast(10);
    System.out.println(hp.topElement());
    hp.printHeap();
    hp.addLast(3);
    hp.addLast(4);
    hp.printHeap();
    hp.addLast(2);
    hp.addLast(6);
    hp.printHeap();
    }

}
