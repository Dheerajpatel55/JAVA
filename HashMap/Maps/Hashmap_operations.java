package Maps;
import java.util.*;
public class Hashmap_operations {
    public static void main(String args[]){
        HashMap <String,Integer> hm = new HashMap<>();
        //Insert O(1)
        hm.put("India",100);
        hm.put("China",140);
        hm.put("Russia",180);
        //Display -GET O(1)
        int Indpop = hm.get("India");
        System.out.println(Indpop);
        System.out.println(hm.get("Indonesia"));
        System.out.println(hm);
        //containsKey-O(1)
        System.out.println(hm.containsKey("India"));//true

        //Remove O(1)
        hm.remove("China");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty() 
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
