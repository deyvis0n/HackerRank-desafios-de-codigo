package strings.comparisons;

import java.util.Scanner;
import java.util.TreeSet;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        TreeSet<String> lex = new TreeSet<>();
        for(int i = 0; i < s.length()-k+1; i++) {
            lex.add(s.substring(i, i+k));
        }
        System.out.println(lex);
        return lex.first() + "\n" + lex.last();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s,k));
    }
}
