import java.util.Scanner;
public class Variabletask4 {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("enter the  name");
        String name =data.nextLine();
        System.out.println("enter the score");
        byte score =data.nextByte();
        data.nextLine();
        System.out.println("enter department");
        String department=data.nextLine();
        float CGPA=score;
        System.out.println("CGPA:"+CGPA/10);
    }

}
