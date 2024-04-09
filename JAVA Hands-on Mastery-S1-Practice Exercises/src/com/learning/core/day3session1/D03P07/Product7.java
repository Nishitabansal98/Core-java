package com.learning.core.day3session1.D03P07;
import java.util.*;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // String representation of the object
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    // CompareTo method for natural sorting using id
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

public class Product7 {
    public static void main(String[] args) {
        // Predefined information for 6 persons
        Person[] persons = {
                new Person(1, "John", 30, 50000),
                new Person(2, "Alice", 25, 60000),
                new Person(3, "Bob", 35, 75000),
                new Person(4, "Emily", 28, 55000),
                new Person(5, "Michael", 40, 80000),
                new Person(6, "Sophia", 22, 45000)
        };

        // Sorting the array using natural ordering (by id)
        Arrays.sort(persons);

        // Printing all the names of persons in uppercase
        for (Person person : persons) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}