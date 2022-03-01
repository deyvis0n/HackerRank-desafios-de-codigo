package data.structures;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        int[] arrayValue = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            arrayValue[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < quantity; i++) {
            System.out.println(arrayValue[i]);
        }
    }
}
