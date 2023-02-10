package edu.skypro.coursework;

import java.util.Objects;

public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private final int id;
    private static int count;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++count;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            System.out.println("Не верно задан отдел");
            return;
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("Вы ввели отрицательное значение");
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + getFullName() + ". id: " + getId() + ". Отдел: " + getDepartment() + ". Зарплата: " + getSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, id);
    }
}
