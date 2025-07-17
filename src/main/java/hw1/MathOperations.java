package hw1;

public class MathOperations {


    public static void main(String[] args) {
        int addResult = add(3,4);
        System.out.println("Результат сложения " + addResult);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }
}
