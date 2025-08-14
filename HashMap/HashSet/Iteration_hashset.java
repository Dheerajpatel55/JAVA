package HashSet;

import java.util.*;

public class Iteration_hashset {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();
        // operations - add(key) contains(key), remove(key) ----O(1)
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        // System.out.println("size: "+hs.size());
        System.out.println(hs);
        // hs is hasset
        Iterator it = hs.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}
