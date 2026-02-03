public class single_level_Inheritance_example {
    static class zoo{
        void zoo(){
            System.out.println("animals in the zoo");
        }
    }
    static class  AquaticAnimals extends zoo{
        void water(){
            System.out.println("fish,octobus,jellyfish");
        }
    }
    public static void main(String[]args){
        zoo obj = new zoo();
        AquaticAnimals obj1 = new  AquaticAnimals();
        obj1.zoo();
        obj1.water();
    }
}
