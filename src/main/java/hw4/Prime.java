package hw4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scanner.nextInt();

        isPrime(num);

    }

    public static boolean isPrime(int num) {
        boolean isPrime = false;

        if(num % num == 0 && num % 1 == 0) {
            isPrime = true;
        }
        return isPrime;
    }

}
