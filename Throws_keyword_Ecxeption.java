public class Throws_keyword_Ecxeption {
    static class a{
        String name="name";
        void div() throws Exception{
            int a =10/0;
            System.out.println(a);
        }
    }
    public static void main(String[]args){
        a a1 = new a();
        try{
            a1.div();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(a1.name);


    }
}
