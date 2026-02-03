import java.util.Scanner;
public class Task1 {
    public static void main(String[]args){
        Scanner data = new Scanner (System.in);
        System.out.println("enter marks:");
        int marks=data.nextInt();
        if(marks>35)
        {
            System.out.println("pass ");
        }
        else
        {
            System.out.println("fail");
        }
    }

}
