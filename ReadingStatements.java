import java.util.Scanner;
public class ReadingStatements {
    static void main(String[] args) {
        Scanner data = new Scanner (System.in);

        byte a =data.nextByte();
        System.out.println(a);

        short b =data.nextShort();
        System.out.println(b);

        int c = data.nextInt();
        System.out.println(c);

        long d = data.nextLong();
        System.out.println(d);

        float e = data.nextFloat();
        System.out.println(e);

        double f = data.nextDouble();
        System.out.println(f);

        String ap=data.next();
        System.out.println(ap);
        data.nextLine();

        String str1=data.nextLine();
        System.out.println(str1);


    }
}
