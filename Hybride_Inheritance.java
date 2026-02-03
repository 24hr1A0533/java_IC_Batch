public class Hybride_Inheritance {
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
    static class Cat extends Animal {
        void meow(){
            System.out.println("meowwwww sound");
        }
    }
    static class Horse extends Cat{
        void run(){
            System.out.println("rinning");
        }
    }
    public static void main(String[]args){
        Animal a = new Animal();
        Dog b = new Dog();
        Cat c = new Cat();
        Horse d = new Horse();
        d.meow();
    }
}
