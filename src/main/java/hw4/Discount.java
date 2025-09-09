package hw4;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Введите цену для расчета скидки: ");
        int price = scanner.nextInt();

        System.out.println(finalPrice(age, price));
    }

    public static double finalPrice(int age, int price) {
        double discountedPrice = price;
        if(age < 18) {
            discountedPrice = price * 0.75;
        } else if (age >= 65) {
            discountedPrice = price * 0.7;
        }
        return discountedPrice;
    }
}
