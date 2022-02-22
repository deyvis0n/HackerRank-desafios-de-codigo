package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();
        Map<Character, Integer> teste = new HashMap<>();

        for(int i = 0; i < a.length(); i++) {
            char chars = a.charAt(i);
            if(!teste.containsKey(chars)) {
                teste.put(chars, 1);
            } else {
                int n = teste.get(chars);
                teste.put(chars, ++n);
            }
        }
        for(int i = 0; i < b.length(); i++) {
            char chars = b.charAt(i);
            if(!teste.containsKey(chars)) {
                return false;
            } else {
                int n = teste.get(chars);
                if(n == 0) {
                    return false;
                } else {
                    teste.put(chars, --n);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        sc.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

}
