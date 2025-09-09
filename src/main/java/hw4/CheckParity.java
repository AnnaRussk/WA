package hw4;

public class CheckParity {
    public static void main(String[] args) {
        checkParity(2);
        checkParity(7);
        checkParity(-4);
    }

    public static void checkParity(int num) {
        if(num % 2 == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не четное");
    }
}
