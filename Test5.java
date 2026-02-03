public class Test5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
