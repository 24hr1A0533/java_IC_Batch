import java.util.Scanner;

public class Hello {
    int a=10;
    void delay() throws Exception {
        int res = a / 0;
        System.out.println(res);
    }
    public static void main(String[] args){
        Hello a=new Hello();
        try{
            a.delay();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(a);
    }
}
