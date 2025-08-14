package Maps;

import java.util.TreeMap;

public class Treemaps {
    public static void main(String args[]) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("india", 100);
        tm.put("russia", 100);
        // sorted in keys
        System.out.println(tm);
    }
}
