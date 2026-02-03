public class Constructor_overLoading {
    static class a {
        int salary;
        String name;

        a() {
            salary = 200;
            name = "Damu";
            System.out.println(salary);
            System.out.println(name);
        }

        a(int a) {
            salary = 2000;
            name = "dinesh";
            System.out.println(salary);
            System.out.println(name);
        }

        a(int a, int b) {
            salary = 20000;
            name = "anil";
            System.out.println(salary);
            System.out.println(name);
        }

        public static void main(String[] args) {
            a obj1 = new a();
            a obj2 = new a(1);
            a obj3 = new a(2, 3);
        }
    }
}
