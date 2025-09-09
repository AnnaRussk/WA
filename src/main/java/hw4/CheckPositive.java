package hw4;

import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число для проверки");
        int someNum = scanner.nextInt();

        isPositive(someNum);

        scanner.close();
    }

    private static void isPositive(int num) {
        if(num > 0) {
            System.out.println(num + " - больше нуля");
        } else if(num < 0) {
            System.out.println(num + " - меньше нуля");
        } else System.out.println(num + " - равен нулю");
    }
}
