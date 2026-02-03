import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int sum =0;
        int temp;

        do {
             temp = data.nextInt();
            sum = sum + temp;
        }
            while (temp>0);

        System.out.println(sum);
        }
    }