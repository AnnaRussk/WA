package hw4;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для сравнения.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        findMax(a, b);

        scanner.close();
    }

    private static void findMax(int a, int b) {
        System.out.println("Максимальное число - " + Math.max(a, b));
    }
}
