package hw4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scanner.nextInt();
        findFactorial(num);
        scanner.close();
    }

    public static void findFactorial(int num) {
        int i = 1;
        int result = 1;
        while (i < num) {
            result = num * (num -1);
            i++;
        }
        System.out.println(result);
    }
}
