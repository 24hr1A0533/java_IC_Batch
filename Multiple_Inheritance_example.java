public class Multiple_Inheritance_example {
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

    static class wild extends AquaticAnimals {
        void land() {
            System.out.println("lion,elephant,tiger");
        }
    }

    public static void main(String[] args) {
        zoo obj = new zoo();
        AquaticAnimals obj1 = new AquaticAnimals();
        wild obj2 = new wild();
        obj2.land();
        obj2.zoo();
    }
}




