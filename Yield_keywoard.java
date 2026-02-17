import java.util.Scanner;
public class Yield_keywoard {
        public static void main() {
            Scanner data = new Scanner(System.in);
            System.out.println("enter a number to find day:");
            byte day = data.nextByte();
            String day1="";
            day1=switch (day) {
                case 1 : yield "sunday";
                case 2 : yield "monday";
                case 3 : yield "tuesday";
                case 4 : yield "wednesday";
                case 5 : yield "thursday";
                case 6 : yield "friday";
                case 7 : yield "saturday";
                default: yield "enter correct number";


            };
            System.out.println(day1);
        }


}
