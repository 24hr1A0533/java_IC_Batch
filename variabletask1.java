import java.util.Scanner;
    public class variabletask1 {
        public static void main(String[]args){
        Scanner data = new Scanner(System.in);
            System.out.println("enter the name");
            String name = data.nextLine();

            System.out.println("enter the age");
            byte age = data.nextByte();

            System.out.println("NAME:"+name);
            System.out.println("AGE:"+age);

    }
}
