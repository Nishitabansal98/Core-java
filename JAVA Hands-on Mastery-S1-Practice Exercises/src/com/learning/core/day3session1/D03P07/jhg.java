package com.learning.core.day3session1.D03P07;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    // Getters and setters

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

    // Overriding toString() method
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    // Overriding hashCode() and equals() methods
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    // Implementing compareTo() method for natural sorting based on id
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id, person.id);
    }
}

public class Main {
    public static void main(String[] args) {
        // Specified information of 6 persons
        Person[] persons = {
                new Person(1, "Alice", 30, 50000),
                new Person(2, "Bob", 35, 60000),
                new Person(3, "Charlie", 40, 70000),
                new Person(4, "David", 45, 80000),
                new Person(5, "Eva", 50, 90000),
                new Person(6, "Frank", 55, 100000)
        };

        // Store persons whose name starts with "J" in a TreeSet for natural sorting
        Set<Person> set1 = new TreeSet<>();
        for (Person person : persons) {
            if (person.getName().startsWith("J")) {
                set1.add(person);
            }
        }

        // Store all persons in a HashSet
        Set<Person> set2 = new HashSet<>();
        for (Person person : persons) {
            set2.add(person);
        }

        // Store persons whose age is less than 40 in a TreeSet for natural sorting
        Set<Person> set3 = new TreeSet<>();
        for (Person person : persons) {
            if (person.getAge() < 40) {
                set3.add(person);
            }
        }

        // Print the first person whose name starts with "J"
        if (!set1.isEmpty()) {
            System.out.println("First person whose name starts with 'J': " + set1.iterator().next());
        } else {
            System.out.println("No person found whose name starts with 'J'");
        }
    }
}