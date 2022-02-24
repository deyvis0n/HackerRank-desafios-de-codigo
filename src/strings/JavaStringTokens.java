package strings.tokens;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if(s.length() >= 1 && s.length() <= 4*(Math.pow(10,5))) {
            String resp[] = s.split("[!,?._'@\\s]+");
            System.out.println(resp.length);
            for (String token : resp) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
