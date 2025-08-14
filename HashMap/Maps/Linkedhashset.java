package Maps;

import java.util.*;

public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(6);
        lhs.add(null);
        lhs.add(5);
        System.out.println(lhs);
        System.out.println(lhs.size());
        int a =10, b = 20;
        a= a^ b^ (b=a);
        System.out.println(a+" "+b);
    }
}
