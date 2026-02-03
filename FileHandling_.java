import java.io.FileWriter;
import java.util.Scanner;
public class FileHandling_ {
    static void main(String[]args){
        Scanner data = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("mtieat.txt");
            fw.write("hello  world");
            fw.append("hey hello");
            String a;
            fw.write(data.nextLine());
            String b;
            fw.write(data.nextLine());
            System.out.println("enjoy the nature");
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
