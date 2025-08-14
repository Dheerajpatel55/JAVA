package Problems;
import java.util.*;
public class Majority_element {
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,1,3,1,5,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
        hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> keys = hm.keySet();
        for(Integer k: keys){
            if(hm.get(k)>arr.length/3){
                System.out.println("Key: "+k);
            }
        }
    }
}
