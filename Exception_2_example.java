import java .util.Scanner;
public class Exception_2_example {
    static class NotValidException extends Exception {
        public NotValidException(String s){
        super(s);
        }
    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        try {
            int age = data.nextInt();
            if (age < 18) {
                throw new NotValidException("your not elizible");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}





