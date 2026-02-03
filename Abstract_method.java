public class Abstract_method {
    abstract static class Nexon{
        abstract void wheels();
        abstract void ac_control();
    }
    static class Nexonbase extends Nexon{
        void ac_control(){

                System.out.println("mannul ac control");
            }
            void wheels(){
                System.out.println("silver");
            }
        }
    static class Nexontop extends Nexon{
        void ac_control(){
            System.out.println("automatic as control");
        }
        void wheels(){
            System.out.println("aoow weels");
        }
    }
    public static void main(String[]args){
                Nexonbase obj = new Nexonbase();
                Nexontop obj1=new Nexontop();
                    obj.ac_control();
    }
}

