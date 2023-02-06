package edu.skypro.coursework;

public class Main {
    static Employee[] employeeBook = new Employee[10];

    public static void main(String[] args) {
        employeeBook[0] = new Employee("Иванов Иван Иванович", 1, 75_000);
        employeeBook[1] = new Employee("Семенов Семен Семенович", 1, 70_000);
        employeeBook[2] = new Employee("Андреев Андрей Андреевич", 2, 65_000);
        employeeBook[3] = new Employee("Петров Петр Петрович", 2, 65_000);
        employeeBook[4] = new Employee("Сергеев Сергей Сергеевич", 3, 5_000);
        employeeBook[5] = new Employee("Романов Роман Романович", 3, 130_000);
        employeeBook[6] = new Employee("Елисеев Елисей Елисеевич", 4, 55_000);
        employeeBook[7] = new Employee("Парфенов Парфен Парфенович", 4, 10_000);
        employeeBook[8] = new Employee("Антонов Антон Антонович", 5, 1_000);
        employeeBook[9] = new Employee("Игнатов Игнат Игнатович", 5, 70_000);

        //printAllEmployees();
        //System.out.println("calculateCostsAmountOnSalaries() = " + calculateCostsAmountOnSalaries());
        //System.out.println("findEmployeeWithMinSalary() = " + findEmployeeWithMinSalary());
        //System.out.println("findEmployeeWithMaxSalary() = " + findEmployeeWithMaxSalary());
        //System.out.println("calculateAverageSalary() = " + calculateAverageSalary());
        //printFullNameAllEmployees();
    }

    public static void printAllEmployees() {
        for (Employee employee : employeeBook) {
            System.out.println(employee.toString());
        }
    }

    public static double calculateCostsAmountOnSalaries() {
        double sum = 0;
        for (Employee employee : employeeBook) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() <= minSalary) {
                minSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee findEmployeeWithMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() >= maxSalary) {
                maxSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static double calculateAverageSalary() {
        return calculateCostsAmountOnSalaries() / employeeBook.length;
    }

    public static void printFullNameAllEmployees() {
        for (Employee employee : employeeBook) {
            System.out.println(employee.getFullName());
        }
    }
}
