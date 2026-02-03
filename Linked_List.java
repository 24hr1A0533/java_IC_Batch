import java.util.LinkedList;

public class Linked_List {
    public static void main(String[]args){
        LinkedList<Integer> lin=new LinkedList<>();
        lin.add(10);
        lin.add(20);
        lin.add(30);
        lin.add(40);
        System.out.println(lin);
        lin.remove(1);
        System.out.println(lin);
    }
}
