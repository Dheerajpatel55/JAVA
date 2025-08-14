import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000, 2000 };
        Arrays.sort(coins, Comparator.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int count = 0, amount = sc.nextInt();
        int db = amount;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
        System.out.println("No.of coins to get change for"+db+"\n"+count);
        sc.close();
    }
}
