import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter a character to find it is vowel or consonent");
        char ch = data.next().charAt(0);
        System.out.println(ch);
        if (ch=='a' || ch=='e' || ch=='i' || ch =='o' || ch=='u')
        {
            System.out.println("vowel");
        }
        else{
            System.out.println("consonent");
        }
    }
}