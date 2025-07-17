package hw1;

public class Maximum {
    public static void main(String[] args) {
        int resultMax = findMax(33, 450);
        System.out.println(resultMax);
    }

    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }
}
