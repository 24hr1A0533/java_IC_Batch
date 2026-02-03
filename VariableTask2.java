import java.util.Scanner;
public class VariableTask2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter the name");
        String name=data.nextLine();

        System.out.println("enter the age ");
        byte age =data.nextByte();
        data.nextLine();
        System.out.println("address");
        String address = data.nextLine();

        System.out.println("roll no");
        String rollno=data.nextLine();

        System.out.println("NAME:"+name);
        System.out.println("AGE"+age);
        System.out.println("ADDRESS:"+address);
        System.out.println("ROLL NO:"+rollno);


    }
}