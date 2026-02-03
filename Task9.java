import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = data.nextInt();
        System.out.println("enter 2nd number");
        int b = data.nextInt();
        for (int i=a;i<=b;i++){
            System.out.println(i);
        }
    }
}