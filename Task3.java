import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter 1 st subject marks");
        int a = data.nextInt();
        System.out.println("enter 2nd subject marks");
        int b = data.nextInt();
        System.out.println("enter 3rd subject marks");
        int c = data.nextInt();
        System.out.println("enter  4th subject marks");
        int d = data.nextInt();
        System.out.println("enter 5th subject marks");
        int e = data.nextInt();
        int f=a+b+c+d+e;
        System.out.println("total:"+f);
        int average=f/5;
        System.out.println("average:"+average);
        if (average<35)
        {
            System.out.println("need extra class");
        }
        else
        {
            System.out.println("no need extra class you can leave");
        }


    }
}
