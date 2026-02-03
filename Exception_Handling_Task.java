import java.util.Scanner;
public class Exception_Handling_Task {
    public static void main(String[]args){
        int temp=0;
        Scanner data=new Scanner(System.in);
        try{
            int a = data.nextInt();
            int b = data.nextInt();
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e);
            temp=1;
        }
        finally{
            if (temp == 1){
                System.out.println("something problem");
            }
            else
                System.out.println("no problem");
        }
    }
}
