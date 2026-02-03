public class Polymorphism_ {
    static class poly {
        void display() {
            System.out.println("Hi i am polymorphism");
        }
        void display(String a) {
            System.out.println(a);
        }
        void display(int a,int b) {
            int c = a+b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        poly p1 = new poly();
        p1.display();
        p1.display("Chiru");
        p1.display(12,19);
    }

}