class A{
    void show(){
        System.out.println(" i am from A");
    }
}
class B extends A{
    void show(){
        System.out.println(" i am from B");
    }
}
class C extends B{
    void show(){
        System.out.println(" i am from C");
    }
}
class D extends C{
    void show(){
        System.out.println(" i am from D");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
      A obj= new B();
        obj.show();
        obj=new C();
        obj.show();
    }

}
