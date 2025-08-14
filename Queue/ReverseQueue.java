import java.util.*;
public class ReverseQueue {
    public static void main(String ars[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        reverse(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.add(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}
