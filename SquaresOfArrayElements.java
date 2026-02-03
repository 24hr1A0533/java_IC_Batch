import java.util.Scanner;
public class SquaresOfArrayElements {
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("enetr the size of an array");
        byte size=data.nextByte();
        int[] arr =new int[size];
        for (int i=0;i<=size-1;i++)
        {
            arr[i]=data.nextInt();
        }
        for (int temp:arr){
            System.out.println(temp*temp);
        }

    }
}
