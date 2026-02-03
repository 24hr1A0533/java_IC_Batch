public class Hirarical_Inheritance_Example {
    static class zoo {
        void zoo() {
            System.out.println("animals in the zoo");
        }
    }

    static class AquaticAnimals extends zoo {
        void water() {
            System.out.println("fish,octobus,jellyfish");
        }
    }

    static class wild extends zoo {
        void land() {
            System.out.println("lion,elephant,tiger");
        }
    }
    public static void main(String[]args){
        zoo obj =new zoo();
        AquaticAnimals obj1=new AquaticAnimals();
        wild obj2=new wild();
        obj2.zoo();
        obj1.zoo();
    }
}

