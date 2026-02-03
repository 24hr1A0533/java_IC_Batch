public class Abstract_method_example {
    abstract static class Zoo{
        abstract void Action();
        abstract void food();
    }
    static class AquaticAnimals extends Zoo{
        void Action(){
            System.out.println("swimming");
        }
        void food(){
            System.out.println("grass");
        }
    }
    static class Wild extends Zoo{
        void Action(){
            System.out.println("running");
        }
        void food(){
            System.out.println("meat");
        }
    }
    public static void main(String[]args){
        AquaticAnimals obj = new AquaticAnimals();
        Wild obj1 = new Wild();
        obj1.Action();
        obj.Action();
    }
}
