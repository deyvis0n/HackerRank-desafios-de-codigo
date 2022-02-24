package object.oriented.programming.java;

public class JavaInheritanceII {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());

        System.out.println(adder.otherAdd(20, 22)
                + " " + adder.otherAdd(7, 6)
                + " " + adder.otherAdd(6, 14));
    }

    static class Arithmetic {
        public int add(int a, int b) {
            return a + b;
        }
    }

    static class Adder extends Arithmetic {
        public int otherAdd(int a, int b) {
            return add(a, b);
        }
    }
}
