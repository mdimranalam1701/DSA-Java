/*
Question: How does an ArrayList-backed stack implement push, pop, and peek?
Example: Push 1, 2, 3 then pop returns 3.
*/
import java.util.*;
public class stack{

    public static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size() == 0;
    }
    //push
    public static void push(int data){
        list.add(data);
    }

    //pop
    public static int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    //peek
    public static int peek(){
        return list.get(list.size()-1);
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}