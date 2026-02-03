import java.util.Scanner;
public class variabletask3 {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("enter value of a");
        int a=data.nextInt();
        System.out.println("enter value of b");
        int b =data.nextInt();
        System.out.println("enter value of c");
        int c =data.nextInt();
        int d =a*b*c;
        int e =a+b+c;
        int f = d/e;
        System.out.println("d divide by e is :"+f);

    }
}
