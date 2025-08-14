package HashSet;
import java.util.*;
public class Hashset {
    public static void main(String args[]){
        //no duplicates, unordered, null is allowed
        HashSet<Integer> hs = new HashSet<>();
        //operations - add(key) contains(key), remove(key) ----O(1)
        hs.add(1);
        hs.add(2);
        System.out.println("size: "+hs.size());
        System.out.println(hs);
        int a = 2;
        if(hs.contains(a))
        hs.remove(a);
        System.out.println(hs);
        


    }
}
