package hw3;

public class MainForUniversity {
    public static void main(String[] args) {
        University petya = new University(1, "Петя");
        University vasya = new University(2, "Вася");
        University kolya = new University(3, "Коля");

        petya.printStudentInfo();

        University.universityName = "Большой Классный Универ";

        petya.printStudentInfo();
        vasya.printStudentInfo();
        kolya.printStudentInfo();
    }
}
