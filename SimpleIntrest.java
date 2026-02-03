import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("enter the principle amount");
        int p=data.nextInt();
        System.out.println("enter the number of years");
        int n=data.nextInt();
        System.out.println("enter the rate");
        int r=data.nextInt();
        int intrest=((p*n*r)/100);
        System.out.println("simple intrest is="+intrest);

    }
}
