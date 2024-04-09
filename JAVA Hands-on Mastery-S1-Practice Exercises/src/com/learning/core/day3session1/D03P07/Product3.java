package com.learning.core.day3session1.D03P07;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
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
        HashSet<Product> productSet = new HashSet<>();

        // Storing information of four products in the HashSet
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Desire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        // Searching for a particular product
        String searchProductId = "P002";
        boolean found = false;

        for (Product product : productSet) {
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