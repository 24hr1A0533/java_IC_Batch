public class SuperThis {
    SuperThis(){
        System.out.println("normal");
    }
    SuperThis(int a){
        System.out.println("int");
    }
}
class child extends SuperThis{
    child(){
        super();
        System.out.println("normal child");
    }
    child(int b){
        this();
        System.out.println("int child");
    }
    public static void main(String[]args){
        child obj = new child(20);
    }

}
