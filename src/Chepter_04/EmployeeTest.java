package Chepter_04;
import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee(null, 700_000, 2017, 7, 24);
        staff[1] = new Employee("Karen Karapetyan", 900000, 2018, 4, 2);
        staff[2] = new Employee("Lilit Hambardzumyan", 700_000, 2017, 8, 20);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", " +
                    "salary = " + e.getSalary() + ", " +
                    "hire date = " + e.getHireDate());
        }
        Employee mark = staff[0];
        mark.raiseSalary(8);
        System.out.println(mark.getSalary());
    }
}

class Employee {
    private final LocalDate hireDate;
    private String name;
    private double salary;

    public Employee(String n, double s, int year, int month, int day) {
        name = Objects.requireNonNullElse(n, "The name cannot be null");
        name = n;
        salary = s;
        hireDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void raiseSalary(double byPercent) {
        double rise = salary * byPercent / 100;
        salary += rise;
    }
}