import java.sql.SQLOutput;
import java.util.Scanner;
public class StudentData {
    static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter department");
        String department=data.nextLine();
        System.out.println("enter name");
        String name =data.nextLine();
        System.out.println("enter rollno");
        String rollno=data.nextLine();
        System.out.println("enter age");
        byte age=data.nextByte();
        System.out.println();
        System.out.println();

        System.out.println("department:"+department);
        System.out.println("name:"+name);
        System.out.println("Roll no:"+rollno);
        System.out.println("Age:"+age);


    }
}



