package com.mycompany.lab5;

public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    // Constructor with all properties
    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public Employee(String name, int id, double salary) {
        this(name, id, salary, "Unknown");
    }
    
    

    // Method 
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }
    

    // Method to display employee details
    public void display() {
        System.out.println("Employee Details");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
    }

    public static void main(String[] args) {
        // Using constructor overloading
        Employee employee1 = new Employee("Alice", 101, 50000.0, "Manager");
        employee1.display();

        Employee employee2 = new Employee("Charlie", 103, 40000.0);
        employee2.display();

        // Using method overloading for setSalary
        employee2.setSalary(35000.0);
        employee2.display();
        employee1.setSalary(45000.0, 5000.0);
        employee1.display();
    }
}
