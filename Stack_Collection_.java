import java.util.Stack;

public class Stack_Collection_ {
    public static void main(String[]args){
        Stack<Integer> stk= new Stack<>();
        stk.push(10);
        stk.push(11);
        stk.push(20);
        stk.add(22);
        System.out.println(stk);
        stk.pop();
        stk.remove(2);//collections we can remove any element
        System.out.println(stk);
        System.out.println(stk.peek());
    }
}
