import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;
public class Exception_throw_keyword {
    public static void main (String[]args){
        Scanner data = new Scanner(System.in);
        try{
            int age =data.nextInt();
            System.out.println(age);
            if(age<1){
                throw new Exception();
            }
        }catch(Exception e){
            System.out.println("enter your age correctly");

        }
        System.out.println("program ended");

    }
}
