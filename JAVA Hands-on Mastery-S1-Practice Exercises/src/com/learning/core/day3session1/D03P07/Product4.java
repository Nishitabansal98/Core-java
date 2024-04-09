package com.learning.core.day3session1.D03P07;

import java.util.HashSet;

class Productt {
    int productId;
    String productName;

    public Productt(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Override hashCode and equals for HashSet usage
    @Override
    public int hashCode() {
        return Integer.hashCode(productId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produc)) return false;
        Produc other = (Produc) obj;
        return productId == other.productId;
    }
}

public class Product4 {
    public static void main(String[] args) {
        // Predefined information of four products
        HashSet<Produc> productsSet = new HashSet<>();
        productsSet.add(new Produc(1, "Product 1"));
        productsSet.add(new Produc(2, "Product 2"));
        productsSet.add(new Produc(3, "Product 3"));
        productsSet.add(new Produc(4, "Product 4"));

        // Removing a product by ProductId
        removeProduct(productsSet, 3);

        // Printing the products set after removal
        System.out.println("Products set after removal:");
        for (Produc product : productsSet) {
            System.out.println("ProductId: " + product.productId + " - ProductName: " + product.productName);
        }
    }

    // Function to remove a product by ProductId
    static void removeProduct(HashSet<Produc> productsSet, int productId) {
        Produc productToRemove = null;
        for (Produc product : productsSet) {
            if (product.productId == productId) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            productsSet.remove(productToRemove);
            System.out.println("Product with ProductId " + productId + " has been removed successfully.");
        } else {
            System.out.println("Product with ProductId " + productId + " not found.");
        }
    }
}