import java.util.Scanner;
public class Exception_error_try_catch {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e){
            System.out.println(e);
        }
        int b=20;
        System.out.println(b);// we can use multiple try and catch in a program
    }
}
