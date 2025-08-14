package Problems;
import java.util.*;
public class Unique_ele {
    public static void main(String[] args) {
        int num[] ={15,1,2,1,4,9,2,3,4,8,4,2,6,5,6,7,5,3,2};
        HashSet <Integer> hs = new HashSet<>();
        for(int i=0;i< num.length;i++){
            hs.add(num[i]);
        }
        System.out.println(hs);
    }
}
