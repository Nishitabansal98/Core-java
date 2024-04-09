package com.learning.core.day3session1.D03P07;

import java.util.HashSet;

class Produc {
    private String productId;
    private String productName;

    public Produc(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}

public class Product3 {
    public static void main(String[] args) {
        HashSet<Produc> productSet = new HashSet<>();

        // Storing information of four products in the HashSet
        productSet.add(new Produc("P001", "Maruti 800"));
        productSet.add(new Produc("P002", "Maruti Zen"));
        productSet.add(new Produc("P003", "Maruti Desire"));
        productSet.add(new Produc("P004", "Maruti Alto"));

        // Searching for a particular product
        String searchProductId = "P003";
        boolean found = false;

        for (Produc product : productSet) {
            if (product.getProductId().equals(searchProductId)) {
                found = true;
                break;
            }
        }

        // Output
        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}