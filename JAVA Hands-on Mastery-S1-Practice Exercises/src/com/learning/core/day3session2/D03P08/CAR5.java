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

public class CAR5 {
    public static void main(String[] args) {
        // Create TreeMap to store car details
        Map<String, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put("Toyota Camry", 25000.0);
        carMap.put("Honda Civic", 22000.0);
        carMap.put("Ford Mustang", 35000.0);
        carMap.put("Chevrolet Corvette", 65000.0);

        // Print all car details
        System.out.println("Car Details:");
        for (Map.Entry<String, Double> entry : carMap.entrySet()) {
            System.out.println("Car: " + entry.getKey() + ", Price: $" + entry.getValue());
        }
    }
}