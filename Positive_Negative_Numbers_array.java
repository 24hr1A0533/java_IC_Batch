import java.util.Scanner;

public class Positive_Negative_Numbers_array {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter size of an Array");
        int size = data.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array elements for size:" + size);
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = data.nextInt();
        }
        System.out.println("positive numbers");
        for (int temp : arr) {
            if (temp > 0) {
                System.out.println("  " + temp);
            }
        }
        System.out.println("negative numbers");
        for (int temp1 : arr) {
            if (temp1 < 0) {
                System.out.println("  " + temp1);
            }
        }
    }
}


