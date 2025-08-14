import java.util.Arrays;

public class MinAbsolute {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };// |1-2|+|2-1|+|3-3|=2
        // but need is minimum absolute value 1-1 2-2 3-3 =0 by sorting both arrays
        int b[] = { 2, 1, 3 };
        Arrays.sort(A);
        Arrays.sort(b);
        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - b[i]);
        }
        System.out.println("MINDIff:" + minDiff);

    }
}
