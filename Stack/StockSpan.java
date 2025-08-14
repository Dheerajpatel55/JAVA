import java.util.Stack;

/*Input: arr[] = [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]
Explanation: Traversing the given input span 100 is greater than equal to 100 and there are no more elements
 behind it so the span is 1, 80 is greater than equal to 80 and smaller than 100 so the span is 1, 60 is 
 \greater than equal to 60 and smaller than 80 so the span is 1, 70 is greater than equal to 60,70 and 
 smaller than 80 so the span is 2 and so on.  Hence the output will be 1 1 1 2 1 4 6.

Input: arr[] = [10, 4, 5, 90, 120, 80]
Output: [1, 1, 2, 4, 5, 1]
Explanation: Traversing the given input span 10 is greater than equal to 10 and there are no more elements behind it 
so the span is 1, 4 is greater than equal to 4 and smaller than 10 so the span is 1, 5 is greater than equal to 4,5 
and smaller than 10 so the span is 2,  and so on. Hence the output will be 1 1 2 4 5 1. */
public class StockSpan {
    public static void spanstock(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stocks.length; i++) {
            int currprice = stocks[i];
            while (!s.isEmpty() && currprice > stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        spanstock(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }
    }
}
