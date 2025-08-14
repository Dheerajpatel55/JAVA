
/*
 * 1. The Thief and the Jewelry Shop 💎🦹‍♂️
A thief breaks into a jewelry shop with a backpack that can carry at most W kg. Inside the shop,
 there are different types of jewelry, each with a certain weight and value. The thief can take 
 fractions of jewelry if needed.

Problem:
How should the thief fill his backpack to maximize the total value of the stolen items?

Input:

jewelry[i] = (weight, value), where each piece has a weight and a value.
The backpack has a capacity of W kg.
Input:  
W = 10  
jewelry = [(5, 60), (3, 50), (4, 70)]  
Output:  
Maximum Value = 130  

Hint: The thief should greedily take items based on the highest value-to-weight ratio.
 */
import java.util.*;

class TheifJewelry {
    public static void main(String[] args) {
        int val[] = { 60, 50, 70 }, weight[] = { 5, 3, 4 }, w = 10;
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) val[i] / weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        // Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
        int cap = w;
        int finalval = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (cap >= weight[idx]) {
                finalval += val[idx];
                cap -= weight[idx];
            } else {
                finalval += ratio[i][1] * cap;
                cap = 0;
                break;
            }
        }
        System.out.println("Theif`s maximum bag value: " + finalval);

    }
}