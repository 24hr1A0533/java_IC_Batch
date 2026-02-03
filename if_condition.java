import java.util.Scanner;
public class if_condition {
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("enter age");
        byte age=data.nextByte();
        data.nextLine();
        System.out.println("enter citizenship");
        String str=data.nextLine();
        if (age>=18 && str.equals("india"))
        {
            System.out.println("eligible for vote");
        }
        else if (age>=18 && str.equals("INDIA"))
        {
            System.out.println("elizible");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}
