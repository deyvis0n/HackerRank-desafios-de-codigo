package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(sc.nextInt() / sc.nextInt());
        } catch (InputMismatchException ime) {
            System.out.println(ime.getClass().getName());
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        sc.close();
    }
}
