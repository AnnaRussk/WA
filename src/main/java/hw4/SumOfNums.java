package hw4;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scanner.nextInt();
        sumOfNums(num);
    }

    public static void sumOfNums(int num) {
        int sumNum = 0;
        for (int i = 1; i < num; i++) {
            sumNum += i;
        }
        System.out.println(sumNum);
    }
}
