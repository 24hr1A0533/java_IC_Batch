import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_collection {
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("kiwi");
        arr.add("mango");
        Iterator<String> it =arr.iterator();
        try{
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}