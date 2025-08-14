import java.util.*;

public class Delete_Element_Heap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void addLast(int data) {
            arr.add(data);
            int lastNode = arr.size() - 1;
            int parent = (lastNode - 1) / 2;

            while (arr.get(lastNode) < arr.get(parent)) {
                int temp = arr.get(lastNode);
                arr.set(lastNode, arr.get(parent));
                arr.set(parent, temp);

                // lastNode = parent;
                // parent = (lastNode - 1) / 2;
            }
        }

        public int topElement() {
            return arr.get(0);
        }

        public void printHeap() {
            System.out.println("Heap: " + arr);
            System.out.println("Size of Heap:" + arr.size());
        }

        // ***************deleting element */
        public int remove() {
            int data = arr.get(0);

            // 1.swap 1st and last Node
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, data);

            // 2.Delete LastNode
            arr.remove(arr.size() - 1);

            // 3.heapify
            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left))
                minIdx = left;
            if (right < arr.size() && arr.get(minIdx) > arr.get(right))
                minIdx = right;
            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }
    }

    public static void main(String args[]) {
        Heap hp = new Heap();
        hp.addLast(5);
        hp.addLast(3);
        hp.addLast(1);
        hp.addLast(10);
        hp.addLast(20);
        hp.addLast(7);

        hp.printHeap();
        System.out.println("top element is " + hp.topElement());
        System.out.println("removed element is " + hp.remove());
        hp.printHeap();

    }

}
