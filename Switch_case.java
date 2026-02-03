import java.util.Scanner;
public class Switch_case {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        String weather=data.nextLine();
        switch(weather){
            case "rinny":
                System.out.println("take umbrella");
                break;
            case "summer":
                System.out.println("use sunglasses");
                break;

            default:
                System.out.println("lets go");
                break;
        }

    }
}
