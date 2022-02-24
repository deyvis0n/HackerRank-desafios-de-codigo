package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int a = 1; a <= 10; a++) {
            int result = N * a;
            System.out.println(N + " x " + a + " = " + result);
        }
    }
}
