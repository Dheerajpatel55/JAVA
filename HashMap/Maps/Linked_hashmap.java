package Maps;
import java.util.*;
public class Linked_hashmap {
    public static void main(String args[]){
        //operations - put, get, remove, size, isEmpty(), Keyset
        LinkedHashMap <String, Integer> lhm = new LinkedHashMap<>();
        //keys are inserted ordered
        
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Russia",80);
        System.out.println(lhm);
    }
}
