public class AnonymousObject {
    AnonymousObject(){
        System.out.println(" its from constructor");
    }
    void show(){
        System.out.println(" i am from show ");
    }

    public static void main(String[] args) {
        new AnonymousObject().show();

    }
}
