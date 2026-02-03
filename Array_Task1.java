import java.util.Scanner;
public class Array_Task1 {
    public static void main(String[]args){
        Scanner data=new Scanner(System.in);
        System.out.println("enter size of an array");
        byte size = data.nextByte();
        int[] arr= new int[size];
        int anil;
        for(int i=0;i<=size-1;i++)
        {
            anil =data.nextInt();
            arr[i]=anil;
        }
        for (int j=0;j<=size-1;j++) {
            System.out.print(arr[j]+",");
        }
    }
}
