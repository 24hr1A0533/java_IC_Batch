public class Multiple_Level_inheritance {
    static class Animal{
        void eat(){
            System.out.println("eating");
        }
    }
    static class Dog extends Animal{
        void bark(){
            System.out.println("barking");
        }
    }
    static class Cat extends Dog{
        void meow(){
            System.out.println("meowwwww sound");
        }
    }
    public static void main(String[]args){
        Animal a=new Animal();
        Dog  b= new Dog();
        Cat c =new Cat();

        a.eat();
        c.eat();
    }
}
