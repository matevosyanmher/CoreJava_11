package Chepter_04;

public class ParamTest {
    public static void main(String[] args) {

        /*
         * Тест 1: методы не могут видоизменять
         * числовые параметры
         */
        System.out.println("Testing tripleValue:");
        double percent = 10.0;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);
        /*
         * Тест 2: методы могут изменять состояние объектов,
         * передаваемых в качестве параметров
         */
        System.out.println("\nTesting tripleSalary");
        var harry = new Employee1("Harry", 5000);
        System.out.println("Before salary =  " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());
        /*
         * Тест 3: методы не могут присоединять новые
         * объекты к объектным параметрам
         */

        System.out.println("\nTesting SWAP:");
        var a = new Employee1("Alice", 70000);
        var b = new Employee1("Bob", 60000);
        System.out.println("Before a = " +a.getName());
        System.out.println("Before b = " +b.getName());
        swap(a, b);
        System.out.println("After a =" + a.getName());
        System.out.println("After b =" + b.getName());
    }

    static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of methode x = " + x);
    }

    public static void tripleSalary(Employee1 x) {
        x.raiseSalary(200);
        System.out.println("End of methode: salary = " + x.getSalary());
    }

    public static void swap(Employee1 x, Employee1 y) {
        Employee1 temp = x;
        x = y;
        y = temp;

        System.out.println("End of methode: x=" + x.getName());
        System.out.println("End of methode: y=" + y.getName());
    }
}

class Employee1 {
    private String name;
    private double salary;

    public Employee1(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double rise = salary * byPercent / 100;
        salary += rise;
    }
}

