package com.learning.core.day3session1.D03P07;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Perso implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Perso(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override compareTo method for natural sorting based on id
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // Override equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }
}

public class Product6 {
    public static void main(String[] args) {
        // Create TreeSet to store Person objects with natural ordering based on id
        TreeSet<Person> personTreeSet = new TreeSet<>();

        // Predefined information of 6 persons
        personTreeSet.add(new Person(1, "John", 30, 50000));
        personTreeSet.add(new Person(2, "Alice", 25, 60000));
        personTreeSet.add(new Person(3, "Bob", 35, 70000));
        personTreeSet.add(new Person(4, "Mary", 28, 55000));
        personTreeSet.add(new Person(5, "David", 40, 80000));
        personTreeSet.add(new Person(6, "Emily", 22, 45000));

        // Print id, name, and salary for each person
        for (Person person : personTreeSet) {
            System.out.println("ID: " + person.getId() + ", Name: " + person.getName() + ", Salary: " + person.getSalary());
        }
    }
}