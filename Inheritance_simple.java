public class Inheritance_simple {
    static class father{
        void car(){
            System.out.println("he had a car");
        }
    }
    static class son extends father{

    }
    public static void main(String[]args){
        father c1 = new father();
        son c2 = new son();
        c1.car();
        c2.car();
    }
}
