package hw2;

public class Car {
/*
    Создайте класс Car с полями brand (строка) и year (целое число).
    Реализуйте конструктор с двумя параметрами, геттеры и сеттеры для обоих полей,
    метод print(), выводящий информацию о марке и годе выпуска. В main создайте объект,
    установите значения через конструктор, измените год через сеттер, выведите информацию.*/

    public static void main(String[] args) {
        Car car1 = new Car("Ford", 2020);
        car1.setYear(2021);

        car1.printInfo();

    }

    String brand;
    int year;

    Car(String newBrand, int newYear) {
        this.brand = newBrand;
        this.year = newYear;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    public void printInfo() {
        System.out.println(this.brand + " " + this.year);
    }
}
