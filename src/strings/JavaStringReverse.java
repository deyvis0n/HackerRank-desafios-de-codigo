package strings;

import java.util.Scanner;


public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name.equals(new StringBuilder(name).reverse().toString()) ? "Yes" : "No");
        sc.close();
    }
}
