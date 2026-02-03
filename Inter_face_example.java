public class Inter_face_example {
        interface a {
            void sound();
        }
        interface b {
            void sound();
        }

        static class c implements a, b {

            public void sound() {
                System.out.println("Sound from class c");
            }
        }

        public static void main(String[] args) {
            c obj = new c();
            obj.sound();
        }
    }
