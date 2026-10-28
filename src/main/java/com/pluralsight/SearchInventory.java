package com.pluralsight;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        for (Product product : inventory) {
            System.out.println(product);
        }

    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product(12345,"Toyota", 45000));
        inventory.add(new Product(45677, "Tesla", 50000));
        inventory.add(new Product(35674, "Ferrari", 80000));
        inventory.add(new Product(31535, "Porsche", 80000));
        inventory.add(new Product(7235, "Prius", 35000));

        return inventory;
    }
}
