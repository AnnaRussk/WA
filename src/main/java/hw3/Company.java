package hw3;

public class Company {
/*
    Класс Company
    Создайте класс Company с полями:
    static String companyName — общее название для всех сотрудников
    final int employeeID — уникальный идентификатор (нельзя менять)
    String employeeName — имя сотрудника Реализуйте конструктор,
    принимающий employeeID и employeeName, статический метод printCompanyName(),
    геттеры и сеттеры для employeeName. В main: создайте несколько сотрудников,
    измените companyName и проверьте, что она изменилась для всех.
    Попробуйте изменить employeeID — должно быть невозможно.*/

    static String companyName;
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Имя компании " + Company.companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
