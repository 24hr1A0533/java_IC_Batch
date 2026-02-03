import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("enter a number to know month and number of days have");
        int month = data.nextInt();

        switch(month){
            case 1:
                System.out.println(" JANUARY it consits of 30 days");
                break;
            case 2:
                System.out.println(" FEBUARY it consits of 28 days");
                break;
            case 3:
                System.out.println(" MARCH it consits of 30 days");
                break;
            case 4:
                System.out.println("APREL  it consits of 31 days");
                break;
            case 5:
                System.out.println(" MAY it consits of 30 days");
                break;
            case 6:
                System.out.println(" JUNE it consits of 31 days");
                break;
            case 7:
                System.out.println(" JULY it consits of 30 days");
                break;
            case 8:
                System.out.println(" AUGUST it consits of 31 days");
                break;
            case 9:
                System.out.println(" SEPTEMBER it consits of 30 days");
                break;
            case 10:
                System.out.println(" OCTOBER it consits of 31 days");
                break;
            case 11:
                System.out.println(" NOVEMBER it consits of 30 days");
                break;
            case 12:
                System.out.println(" DECEMBER it consits of 31 days");
                break;
            default:
                System.out.println("not present");
                break;
        }
    }
}