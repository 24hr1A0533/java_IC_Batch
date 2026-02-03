import java.util.LinkedList;
import java.util.Queue;

public class Queue_Collection {
    public static void main(String[]args){
        Queue<Integer> queue= new LinkedList<>();
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove(30);
        System.out.println(queue);
    }

}
