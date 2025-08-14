package Maps;
import java.util.*;
public class Iteration_HasMap {
    public static void main(String args[]){
        HashMap <String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",140);
        hm.put("Russia",80);
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String string : keys) {
            System.out.println("Key: "+string+", value: "+hm.get(string));
        }
    }
}
