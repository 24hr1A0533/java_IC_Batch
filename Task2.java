import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
        Scanner data = new Scanner (System.in);
        System.out.println("enter income:");
        int income=data.nextInt();
        if(income<7000)
        {
            System.out.println("scholer  ship is avilable");
        }
        else
        {
            System.out.println("scholer ship is not available");
        }
        }
    }