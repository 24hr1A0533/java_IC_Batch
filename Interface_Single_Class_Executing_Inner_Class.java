public class Interface_Single_Class_Executing_Inner_Class {
    interface a{
        void display();
        void dis();
    }
    public static void main(String[]args){
        a a1 = new a() {
            public void display(){
                System.out.println("hello buddy");
            }
            public void dis(){
                System.out.println("hello whattsapp");
            }
        };
        a1.display();
    }
}
