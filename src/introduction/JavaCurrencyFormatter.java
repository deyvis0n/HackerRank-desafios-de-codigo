package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");
        Locale brazilLocale = new Locale("pt-BR", "BR");
        Locale argentinaLocale = new Locale("es", "AR");
        Locale japaoLocale = new Locale("ja", "JP");
        Locale koreaKorea = new Locale("ko", "KR");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat brazil = NumberFormat.getCurrencyInstance(brazilLocale);
        NumberFormat argentina = NumberFormat.getCurrencyInstance(argentinaLocale);
        NumberFormat japao = NumberFormat.getCurrencyInstance(japaoLocale);
        NumberFormat korea = NumberFormat.getCurrencyInstance(koreaKorea);
        NumberFormat china =  NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("Brazil: " + brazil.format(payment));
        System.out.println("Argentina: " + argentina.format(payment));
        System.out.println("Japão: " + japao.format(payment));
        System.out.println("Korea: " + korea.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
