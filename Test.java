
import java.util.Random;
public class Test {
    public static void main(String[]args){
        Random data =new Random();
        int nemnum=0;
        while(nemnum!=5){
            nemnum=data.nextInt(11);
            System.out.println(nemnum);
        }
    }
}
