import java.util.Scanner;
public class Largest_Number_In_Array {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size=data.nextInt();
        int[] arr =new int[size];

        System.out.println("Enter Array elements for size:"+size);
        for (int i=0;i<=size-1;i++)
        {
            arr[i]=data.nextInt();
        }
        int temp =arr[0];
        for (int i=0;i<=size-1;i++)
        {
            if (temp<arr[i])
            {

                temp=arr[i];
            }

        }
        System.out.println("highest element is:"+temp);
    }

}
