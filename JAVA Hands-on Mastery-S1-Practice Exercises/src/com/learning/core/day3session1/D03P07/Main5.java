package com.learning.core.day3session1.D03P07;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    int id;
    String name;
    int age;
    double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Override toString method to print person's details
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }

    // Override compareTo method for natural sorting based on id
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Predefined information of 6 persons
        TreeSet<Person> treeFact = new TreeSet<>();
        treeFact.add(new Person(101, "John", 30, 50000));
        treeFact.add(new Person(102, "Alice", 25, 60000));
        treeFact.add(new Person(103, "Bob", 28, 55000));
        treeFact.add(new Person(104, "Emily", 35, 70000));
        treeFact.add(new Person(105, "David", 23, 45000));
        treeFact.add(new Person(106, "Sophia", 26, 58000));

        // Print all person's details whose age is greater than 25
        System.out.println("Person's details whose age is greater than 25:");
        for (Person person : treeFact) {
            if (person.age > 25) {
                System.out.println(person);
            }
        }
    }
}