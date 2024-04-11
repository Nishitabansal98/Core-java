package com.learning.core.day3session2.D03P08;
 import java.util.*;

class Car7 implements Comparable<Car> {
    private String name;
    private double price;

    public Car7(String name, double price) {
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

public class Main7 {
    public static void main(String[] args) {
        // Create TreeMap to store car details
        Map<Car, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car("Toyota Camry", 25000.0), 25000.0);
        carMap.put(new Car("Honda Civic", 22000.0), 22000.0);
        carMap.put(new Car("Ford Mustang", 35000.0), 35000.0);
        carMap.put(new Car("Chevrolet Corvette", 65000.0), 65000.0);

        // Retrieve the key-value mapping associated with the greatest price
        Map.Entry<Car, Double> maxEntry = carMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .orElse(null);

        // Retrieve the key-value mapping associated with the least price
        Map.Entry<Car, Double> minEntry = carMap.entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .orElse(null);

        // Print the key-value mappings associated with the greatest and least prices
        if (maxEntry != null) {
            System.out.println("Car with the greatest price: " + maxEntry.getKey() + ", Price: $" + maxEntry.getValue());
        } else {
            System.out.println("No car found with the greatest price.");
        }

        if (minEntry != null) {
            System.out.println("Car with the least price: " + minEntry.getKey() + ", Price: $" + minEntry.getValue());
        } else {
            System.out.println("No car found with the least price.");
        }
    }
}