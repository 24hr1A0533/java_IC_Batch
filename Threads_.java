import java.util.Scanner;
public class Threads_ {
    static  class a extends Thread{
        public void run(){
            for(int i =0;i<5;i++){
                System.out.println("he hello");
            }try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    static class b extends Thread{
        public void run(){
            for (int i=0;i<=5;i++){
                System.out.println("hello buddy");
            }try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[]args){
        a a1=new a();
        a1.start();
        b b1 =new b();
        b1.start();
    }
}
