import java.util.HashSet;

public class HashSet_collection {
    public static void main(String[]args){
        HashSet<Integer> hash = new HashSet<>();
        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(40);//cant give duplicates in hashset
        System.out.println(hash);
        hash.remove(10);
        System.out.println(hash);
    }
}
