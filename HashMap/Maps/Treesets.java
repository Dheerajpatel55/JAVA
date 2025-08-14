package Maps;
import java.util.*;
public class Treesets {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        //sorted in ascending oreder
        //null values not allowed
        ts.add(1);
        ts.add(4);
        ts.add(2);
        ts.add(10);
        // complexity - O(log n)
        System.out.println(ts);
    }
}
