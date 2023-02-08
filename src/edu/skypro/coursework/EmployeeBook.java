package edu.skypro.coursework;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        employees = new Employee[10];
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
    }

    public double calculateCostsAmountOnSalaries() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public Employee findMinSalary() {
        double minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    public Employee findMaxSalary() {
        double maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    public double calculateAverageSalary() {
        return calculateCostsAmountOnSalaries() / size;
    }

    public void printFullNameAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public void indexSalary(int indexRateInPercent) {
        for (int i = 0; i < size; i++) {
            employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexRateInPercent / 100);
        }
    }

    public Employee findMinSalaryInDepartment(int department) {
        double minSalaryInDepartment = Integer.MAX_VALUE;
        Employee employee = null;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < minSalaryInDepartment && employees[i].getDepartment() == department) {
                minSalaryInDepartment = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    public Employee findMaxSalaryInDepartment(int department) {
        double maxSalaryInDepartment = Integer.MIN_VALUE;
        Employee employee = null;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > maxSalaryInDepartment && employees[i].getDepartment() == department) {
                maxSalaryInDepartment = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;
    }

    public double calculateCostsAmountOnSalariesInDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public double calculateAverageSalaryInDepartment(int department) {
        int countEmployeesInDepartment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                ++countEmployeesInDepartment;
            }
        }
        return calculateCostsAmountOnSalariesInDepartment(department) / countEmployeesInDepartment;
    }

    public void indexSalaryInDepartment(int indexRateInPercent, int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * indexRateInPercent / 100);
            }
        }
    }

    public void printAllEmployeesInDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment()) {
                System.out.println(employees[i]);
            }
        }
    }

    public void printEmployeesIfTheySalaryLessThen(int salaryLessThen) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salaryLessThen) {
                System.out.println(employees[i]);
            }
        }
    }

    public void printEmployeesIfTheySalaryMoreThen(int salaryMoreThen) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salaryMoreThen) {
                System.out.println(employees[i]);
            }
        }
    }

    public void addEmployee(String fullName, int department, double salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
        }
        Employee newEmployee = new Employee(fullName, department, salary);
        employees[size++] = newEmployee;
    }

    public void removeEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.out.println(employees[i].getFullName() + ". Id: " + employees[i].getId() + ", удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Сотрудник с id " + id + " не найден");
    }

    public void removeEmployeeByFullName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                System.out.println(employees[i].getFullName() + ". Id: " + employees[i].getId() + ", удален");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
        System.out.println("Сотрудник с ФИО " + fullName + " не найден");
    }

    public void changeSalary(String fullName, double newSalary) {
        for (int i = 0; i < size; i++) {
            if (fullName.equals(employees[i].getFullName())) {
                employees[i].setSalary(newSalary);
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Сотрудник с ФИО " + fullName + " не найден");
    }

    public void changeDepartment(String fullName, int newDepartment) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getFullName().equals(fullName)) {
                employees[i].setDepartment(newDepartment);
                System.out.println(employees[i]);
                return;
            }
        }
        System.out.println("Сотрудник с ФИО " + fullName + " не найден");
    }

    public void printEmployeesByDepartment() {
        int numOfDepartments = 5;
        for (int i = 1; i <= numOfDepartments; i++) {
            System.out.println("Отдел № " + i);
            for (int j = 0; j < size; j++) {
                if (i == employees[j].getDepartment()) {
                    System.out.println(employees[j].getFullName());
                }
            }
        }
    }
}
