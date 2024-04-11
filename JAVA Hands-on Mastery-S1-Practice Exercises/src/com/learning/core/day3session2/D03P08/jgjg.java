package com.learning.core.day3session2.D03P08;

import java.util.*;

class Employee {
    private int employeeId;
    private String name;
    private String department;
    private String designation;

    public Employee(int employeeId, String name, String department, String designation) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Department: " + department + ", Designation: " + designation;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, department, designation);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return employeeId == employee.employeeId &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department) &&
                Objects.equals(designation, employee.designation);
    }
}

9    public static void main(String[] args) {
        // Create Hashtable to store employee details with employee ID as key
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined employee details
        Employee employee1 = new Employee(101, "John Doe", "Engineering", "Software Engineer");
        Employee employee2 = new Employee(102, "Jane Smith", "Human Resources", "HR Manager");
        Employee employee3 = new Employee(103, "Alice Johnson", "Marketing", "Marketing Coordinator");
        Employee employee4 = new Employee(104, "Bob Brown", "Finance", "Financial Analyst");

        // Add employees to the Hashtable with employee ID as key
        employeeTable.put(employee1.hashCode(), employee1);
        employeeTable.put(employee2.hashCode(), employee2);
        employeeTable.put(employee3.hashCode(), employee3);
        employeeTable.put(employee4.hashCode(), employee4);

        // Verify whether the Hashtable is empty or not
        System.out.println("Is the Hashtable empty? " + employeeTable.isEmpty());
    }
}