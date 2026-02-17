import java.util.Scanner;

import java.util.Scanner;
public class Adv_Switch_Expresion {
    public static void main() {
        Scanner data = new Scanner(System.in);
        System.out.println("enter a number to find day:");
        byte day = data.nextByte();
        String day1="";
         day1=switch (day) {
            case 1 -> "sunday";
            case 2 -> "monday";
            case 3 -> "tuesday";
            case 4 -> "wednesday";
            case 5 -> "thursday";
            case 6 -> "friday";
            case 7 ->  "saturday";
            default -> ("enter a valid day");
        };
        System.out.println(day1);
    }
}
