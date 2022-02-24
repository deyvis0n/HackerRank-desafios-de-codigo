package object.oriented.programming.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaAbstractClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyBook book = new MyBook();
        book.setTitle(br.readLine());
        System.out.println("The title is: " + book.getTitle());
        br.close();
    }

    static abstract class Book {
        String title;
        abstract void setTitle(String s);
        String getTitle() {
            return title;
        }
    }

    static class MyBook extends Book{
        @Override
        void setTitle(String s) {
            this.title = s;
        }
    }
}
