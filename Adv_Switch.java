import java.util.Scanner;
public class Adv_Switch {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("enter a number to find day");
        byte day=data.nextByte();
        switch (day){
            case 1 -> System.out.println("sunday");
            case 2 -> System.out.println("monday");
            case 3 -> System.out.println("tuesday");
            case 4 -> System.out.println("wednesday");
            case 5 -> System.out.println("thursday");
            case 6 -> System.out.println("friday");
            case 7 -> System.out.println("saturday");
            default -> System.out.println("enter a valid day");
        }

    }
}
