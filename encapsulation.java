public class encapsulation {
   static class Student{
       private String name;
       private int age;

       public String getName(){
           return name;
       }
       public void setName(String n){
           name=n;
       }
       public int getAge(){
           return age;
       }
       public void setAge(int a ){
           age =a;
       }
   }

   public static void main(String[]args){
       Student s = new Student();
       s.setName("xyz");
       System.out.println(s.getName());
       s.setAge(23);
       System.out.println(s.getAge() );
   }
}
