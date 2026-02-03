import java.util.Scanner;

public class Odd_count_Array {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = data.nextInt();
        int[] arr = new int[size];
        int even =0;
        int odd =0;

        System.out.println("Enter Array elements for size:" + size);
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = data.nextInt();
            if(arr[i]%2==0)
            {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("odd number count:"+odd);
    }
}