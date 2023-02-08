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
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + getFullName() + ". id: " + getId() + ". Отдел: " + getDepartment() + ". Зарплата: " + getSalary();
    }
}
