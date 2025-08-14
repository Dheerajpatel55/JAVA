package Problems;

import java.util.*;
class Subarray{
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10}, k = -10;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum =0;
        int ans=0;
        hm.put(0,1);
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hm.containsKey(sum-k)){
                ans += hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum,0)+1);
            System.out.println(hm +" "+ ans);
       }
       System.out.println(ans);
    }
}