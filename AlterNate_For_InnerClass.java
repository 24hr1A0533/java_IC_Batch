public class AlterNate_For_InnerClass {
    interface a{
        void display();
    }
    interface b{
        void dis();
    }
    public static void main(String[]args){
        a a1 = () ->{
            System.out.println("hello this is display");
        };
        b b1 =() ->{
            System.out.println("hello buddy");
        };
        a1.display();
        b1.dis();
    }
}
