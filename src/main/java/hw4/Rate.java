package hw4;

import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение оценки: ");
        int rate = scanner.nextInt();

        checkRate(rate);
    }

    public static void checkRate(int rate) {
        switch (rate) {
            case 5 -> System.out.println(Rates.Отлично);
            case 4 -> System.out.println(Rates.Хорошо);
            case 3 -> System.out.println(Rates.Удовлетворительно);
            case 2, 1 -> System.out.println(Rates.Неудовлетворительно);
            default -> throw new IllegalStateException("Введите валидное значение.");
        }
    }

}
