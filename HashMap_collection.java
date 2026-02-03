import java.util.HashMap;

public class HashMap_collection {
    public static void main(String[]args){
        HashMap<Integer,Character> hsh= new HashMap<>();
        hsh.put(1,'i');
        hsh.put(2,'f');
        hsh.put(3,'k');
        hsh.put(4,'l');
        System.out.println(hsh);
        hsh.remove(2);
        System.out.println(hsh);
    }
}
