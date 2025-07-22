package hw2;

public class Rectangle {
    int width;
    int height;

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(10, 15);
        rec1.width = 11;
        System.out.println(rec1.calculateArea());
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}
