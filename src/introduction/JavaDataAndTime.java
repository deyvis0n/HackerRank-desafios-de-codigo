package introduction;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDataAndTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String res = Result.findDay(month, day, year);

        System.out.println(res);

        sc.close();
    }

}

class Result {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
