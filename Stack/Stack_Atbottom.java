import java.util.*;
//push at the bottom of the stack

public class Stack_Atbottom {
    public static void AddAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        AddAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        AddAtBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}