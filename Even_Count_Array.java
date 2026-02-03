import java.util.Scanner;

public class Even_Count_Array {


    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = data.nextInt();
        int[] arr = new int[size];
        int count =0;

        System.out.println("Enter Array elements for size:" + size);
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = data.nextInt();
        }
        for (int i=0;i<=size-1;i++)
        {
            if (arr[i]%2==0)
            {
                count++;
            }
        }
        System.out.println("even number count:"+count);
    }
}

