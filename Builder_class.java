import java.util.Scanner;
public class Builder_class {
    public static void main(String[]args){
    Scanner data=new Scanner(System.in);
    String s=data.nextLine();
    StringBuilder sb=new StringBuilder(s);
    String str =sb.reverse().toString();
    String str1=str;
    if(s.equals(str1))
    {
        System.out.println("palindrome");
    }
    else
    {
        System.out.println("not a palindrome");
    }
    }
}
