
import java.util.Scanner;
public class Exception_finally_keyWord {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        int err=0;
        try {
            int a = data.nextInt();
            System.out.println(a);
        } catch (Exception e){
            err=1;
            System.out.println(e);
        }
        finally{
            if (err==1){
                System.out.println("error found");
            }
            else {
                System.out.println("error not found");
            }
        }

    }
}