import java.util.*;

/* Knapscak_Problem-
 *                  0/1 Knapsack Problem.
 * 💼 "Treasure Hunt: Maximize Your Loot!"
You are a treasure hunter entering a dungeon with a backpack that can carry at most W kilograms.
Inside, you discover N* magical items. Each item has:
a value (gold coins it brings you 💰)
a weight (in kilograms 🏋️‍♂️)
However, due to the magic spell on the dungeon, you can’t take part of an item — it’s all or nothing!
Your goal: Pick items to maximize your gold, without overloading your backpack and taking a part of an item into a bag to fill it
🔍 Can you figure out the best combination of loot using Dynamic Programming?
 */
public class Knapscak_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of items in treasure:");
        int n = sc.nextInt();
        System.out.print("Enter weight that can carry at most:");
        int W = sc.nextInt();
        int value[] = { 10, 40, 30, 50 };// new int[n];
        int weight[] = { 2, 4, 6, 3 };// new int[n];
        // for(int i=0;i<n;i++){
        // value[i]=sc.nextInt();
        // weight[i]=sc.nextInt();
        // }
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weight[i - 1] <= w) {
                    // Option 1: exclude the item
                    // Option 2: include the item and add its value
                    dp[i][w] = Math.max(
                            dp[i - 1][w],
                            dp[i - 1][w - weight[i - 1]] + value[i - 1]);
                } else {
                    // If item too heavy, can't include it
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        System.out.println(dp[n][W]);
        sc.close();
    }
}
