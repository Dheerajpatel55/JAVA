package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Main_Deque {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);//1
        dq.addFirst(2);//2 1
        System.out.println(dq.getFirst());
        dq.add(3);//add last  2 1 3
        System.out.println(dq.getLast());
        dq.addLast(4);//2 1 3 4
        System.out.println(dq);
        dq.remove();//remove first element 1,3,4
        System.out.println(dq);
        dq.removeLast();//removeslast
        System.out.println(dq);
    }
}
