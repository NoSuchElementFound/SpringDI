package com.example.springdi;

public class Employee {
    //for showing the setter injection concept
    public Employee() {
        System.out.println("Employee Constructor");
    }
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
