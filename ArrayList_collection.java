import java.util.ArrayList;

public class ArrayList_collection {
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("kiwi");
        arr.add("mango");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
    }
}
