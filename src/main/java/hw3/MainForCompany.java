package hw3;

public class MainForCompany {
/*
    В main: создайте несколько сотрудников,
    измените companyName и проверьте, что она изменилась для всех.
    Попробуйте изменить employeeID — должно быть невозможно*/

    public static void main(String[] args) {
        Company petya = new Company(123, "Петя");
        Company kolya = new Company(124, "Коля");
        Company vasya = new Company(125, "Вася");

        System.out.println(Company.companyName);
        Company.companyName = "Своя Компания";
        System.out.println(Company.companyName);

    }

}
