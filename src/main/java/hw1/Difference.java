package hw1;

public class Difference {
    public static void main(String[] args) {
        int difRes = difference( -7, 3);
        int difRes1 = difference( 7, 10);
        int difRes2 = difference( 8, 8);
        System.out.println(difRes);
        System.out.println(difRes1);
        System.out.println(difRes2);

    }

    public static int difference(int x, int y) {
        int result = 0;
        if (x > y) {
            result = x - y;
        } else result = y - x;

        return result;
    }
}
