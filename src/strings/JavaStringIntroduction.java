package strings;

import java.util.Scanner;

public class JavaStringIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(a.replaceFirst(String.valueOf(a.charAt(0)), String.valueOf(a.toUpperCase().charAt(0)))
                + " " + b.replaceFirst(String.valueOf(b.charAt(0)), String.valueOf(b.toUpperCase().charAt(0))));

    }
}
