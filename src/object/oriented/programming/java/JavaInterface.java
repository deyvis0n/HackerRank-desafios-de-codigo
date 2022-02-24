package object.oriented.programming.java;

import java.util.Scanner;

public class JavaInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyCalculator mc = new MyCalculator();

        System.out.println("I implemented: " + mc.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(mc.divisorSum(scanner.nextInt()));
    }

    static class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisorSum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public interface AdvancedArithmetic {
        int divisorSum(int n);
    }
}
