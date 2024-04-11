package com.learning.core.day3session2.D03P08;

import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Car: " + name + ", Price: $" + price;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    // Override compareTo method for natural ordering based on price
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class Car8 {
    public static void main(String[] args) {
        // Create TreeMap to store car details
        TreeMap<Car, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car("Toyota Camry", 25000.0), 25000.0);
        carMap.put(new Car("Honda Civic", 22000.0), 22000.0);
        carMap.put(new Car("Ford Mustang", 35000.0), 35000.0);
        carMap.put(new Car("Chevrolet Corvette", 65000.0), 65000.0);

        // Remove and get the key-value mapping associated with the greatest value
        Map.Entry<Car, Double> greatestEntry = carMap.pollLastEntry();

        // Get the greatest key
        Car greatestKey = carMap.lastKey();

        // Print the removed key-value mapping associated with the greatest value
        if (greatestEntry != null) {
            System.out.println("Removed car with the greatest price: " + greatestEntry.getKey() + ", Price: $" + greatestEntry.getValue());
        } else {
            System.out.println("No car found with the greatest price.");
        }

        // Print the greatest key
        if (greatestKey != null) {
            System.out.println("Greatest key: " + greatestKey);
        } else {
            System.out.println("No greatest key found.");
        }
    }
}