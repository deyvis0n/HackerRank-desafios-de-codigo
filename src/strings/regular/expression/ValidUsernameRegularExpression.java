package strings.regular.expression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int quantity = Integer.parseInt(br.readLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println(validateUserName(br.readLine()));
        }
        br.close();
    }

    public static String validateUserName(String name) {
        String regexValidator = "^[a-zA-Z]\\w{7,29}$";
        return name.matches(regexValidator) ? "Valid" : "Invalid";
    }

}
