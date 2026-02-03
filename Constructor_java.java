public class Constructor_java {
    static class a{
        int salary;
        String name;
        a(){
            salary =20000;
            name ="kishore";
        }
    }
    public static void main (String[]args){
        a obj=new a();
        System.out.println(obj.salary);
        System.out.println(obj.name);
    }
}
