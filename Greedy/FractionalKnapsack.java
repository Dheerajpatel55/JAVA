import java.util.*;

public class FractionalKnapsack {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;
        double ratio[][] = new double[val.length][2];
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int cap = w, finalval = 0;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (cap >= weight[idx]) {
                finalval += val[idx];
                cap -= weight[idx];
            } else {
                finalval += (ratio[i][1] * cap);
                cap = 0;
                break;
            }
        }
        System.out.println("Max Final value : " + finalval);
    }
}