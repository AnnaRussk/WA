package hw4;

public class DivideOnThree {
    public static void main(String[] args) {
        checkDivideOnThree();
    }

    public static void checkDivideOnThree() {
        for (int i = 1; i < 100; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
