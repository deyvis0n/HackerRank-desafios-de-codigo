package object.oriented.programming.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaInstanceOfKeyword {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        String text;
        InstanceOfTutorial iot = new InstanceOfTutorial();

        for (int  i = 0; i < quantity; i++) {
            text = scanner.next();
            if (text.equals("Student")) mylist.add(new Student());
            if (text.equals("Rockstar")) mylist.add(new Rockstar());
            if (text.equals("Hacker")) mylist.add(new Hacker());
        }
        System.out.println(iot.count(mylist));
    }

    static class InstanceOfTutorial {
        String count (ArrayList mylist) {
            int a = 0;
            int b = 0;
            int c = 0;

            for (int i = 0; i < mylist.size(); i++) {
                Object element = mylist.get(i);
                if (element instanceof Student) a++;
                if (element instanceof Rockstar) b++;
                if (element instanceof Hacker) c++;
            }
            return Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        }
    }

    static class Student{}
    static class Rockstar{}
    static class Hacker{}
}
