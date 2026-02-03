import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter a number  to find it is divisible by 3 and 5");
        int num = data.nextInt();
        if (num%3==0 && num%5==0)
        {
            System.out.println("entered number divisible by 3 and 5");
        }
        else {
            System.out.println("not divisible");
        }
        }
    }