package strings;

import java.util.Scanner;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        while (quantity > 0) {
            System.out.println(validateUserName(scanner.next()));
            quantity--;
        }
    }

    public static String validateUserName(String name) {
        String regexValidator = "[a-zA-Z]\\w{7,29}";
        return name.matches(regexValidator) ? "Valid" : "Invalid";
    }
}
