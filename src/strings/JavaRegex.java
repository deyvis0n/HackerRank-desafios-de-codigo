package strings;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String ip = scanner.nextLine();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    private String ip255 = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = ip255 + "\\." + ip255 + "\\." + ip255 + "\\." + ip255;
}