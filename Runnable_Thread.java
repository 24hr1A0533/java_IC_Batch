import java.util.Scanner;
public class Runnable_Thread {
    static class a implements Runnable{
        public void run(){
            for(int i =0;i<5;i++){
                System.out.println("hey hello");
            }
        }
    }
    static class b implements Runnable{
        public void run(){
            for(int i =0;i<5;i++){
                System.out.println("hey buddyy");
            }
        }
        void display(){
            System.out.println("hello how are you");
        }
    }
    public static void main(String[]args){
        a a1 = new a();
        b b1 = new b();

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();

        b1.display();
    }

}