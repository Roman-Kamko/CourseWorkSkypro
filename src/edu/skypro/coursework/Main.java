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
        //System.out.println("calculateCostsAmountSalaries() = " + calculateCostsAmountOnSalaries());
        //System.out.println("findEmployeeWithMinSalary() = " + findMinSalary());
        //System.out.println("findEmployeeWithMaxSalary() = " + findMaxSalary());
        //System.out.println("calculateAverageSalary() = " + calculateAverageSalary());
        //printFullNameAllEmployees();

        //indexSalary(10);
        //printAllEmployees();

        //System.out.println("findMinSalaryInDepartment(4) = " + findMinSalaryInDepartment(4));
        //System.out.println("findMaxSalaryInDepartment(4) = " + findMaxSalaryInDepartment(4));
        //System.out.println("calculateCostsAmountSalariesInDepartment(5) = " + calculateCostsAmountOnSalariesInDepartment(5));
        //System.out.println("calculateAverageSalaryInDepartment(5) = " + calculateAverageSalaryInDepartment(5));

        //indexSalaryInDepartment(10, 5);
        //printAllEmployeesInDepartment(5);

        //printEmployeesIfTheySalaryLessThen(20_000);
        //printEmployeesIfTheySalaryMoreThen(70_000);
    }


    public static void printAllEmployees() {
        for (Employee employee : employeeBook) {
            System.out.println(employee);
        }
    }

    public static double calculateCostsAmountOnSalaries() {
        double sum = 0;
        for (Employee employee : employeeBook) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee findMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() > maxSalary) {
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

    public static void indexSalary(int indexRateInPercent) {
        for (Employee employee : employeeBook) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() * indexRateInPercent / 100));
        }
    }

    public static Employee findMinSalaryInDepartment(int department) {
        double minSalaryInDepartment = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() < minSalaryInDepartment && department == value.getDepartment()) {
                minSalaryInDepartment = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee findMaxSalaryInDepartment(int department) {
        double maxSalaryInDepartment = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee value : employeeBook) {
            if (value.getSalary() > maxSalaryInDepartment && department == value.getDepartment()) {
                maxSalaryInDepartment = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static double calculateCostsAmountOnSalariesInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employeeBook) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static double calculateAverageSalaryInDepartment(int department) {
        int countEmployeesInDepartment = 0;
        for (Employee employee : employeeBook) {
            if (employee.getDepartment() == department) {
                ++countEmployeesInDepartment;
            }
        }
        return calculateCostsAmountOnSalariesInDepartment(department) / countEmployeesInDepartment;
    }

    public static void indexSalaryInDepartment(int indexRateInPercent, int department) {
        for (Employee employee : employeeBook) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * indexRateInPercent / 100));
            }
        }
    }

    public static void printAllEmployeesInDepartment (int department) {
        for (Employee employee : employeeBook) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesIfTheySalaryLessThen(int salaryLessThen) {
        for (Employee employee : employeeBook) {
            if (employee.getSalary() < salaryLessThen) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesIfTheySalaryMoreThen(int salaryMoreThen) {
        for (Employee employee : employeeBook) {
            if (employee.getSalary() > salaryMoreThen) {
                System.out.println(employee);
            }
        }
    }
}

