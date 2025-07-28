package hw3;

public class University {
/*
    static String universityName — общее имя университета
    final int studentID — уникальный ID
    String studentName Реализуйте конструктор для studentID и studentName,
    статический метод changeUniversityName(String newName), геттер для studentName,
    метод printStudentInfo() — выводит имя, ID и университет. В main: создайте 3 студента,
    измените название университета и выведите данные.*/

    static String universityName;
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("Имя студента " + studentName +
                " , уникальный ИД " + studentID +
                " учится в университете " + universityName);
    }

}
