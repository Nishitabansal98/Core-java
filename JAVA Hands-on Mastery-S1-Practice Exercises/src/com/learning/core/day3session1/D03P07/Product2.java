package com.learning.core.day3session1.D03P07;

import java.util.HashMap;

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

public class Product2{
    public static void main(String[] args) {
        HashMap<String, Product> productMap = new HashMap<>();

        // Predefined information of four products
        Product product1 = new Product("P001", "Maruti 800");
        Product product2 = new Product("P002", "Maruti Zen");
        Product product3 = new Product("P003", "Maruti Desire");
        Product product4 = new Product("P004", "Maruti Alto");

        // Storing products in the HashMap
        productMap.put(product1.getProductId(), product1);
        productMap.put(product2.getProductId(), product2);
        productMap.put(product3.getProductId(), product3);
        productMap.put(product4.getProductId(), product4);

        // Listing all product details
        System.out.println("Product Details:");
        for (Product product : productMap.values()) {
            System.out.println(product.getProductId() + ", " + product.getProductName());
        }
    }
}