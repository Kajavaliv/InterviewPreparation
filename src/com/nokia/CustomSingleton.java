package com.nokia;

import java.util.ArrayList;
import java.util.List;

public class CustomSingleton {
    // Maximum number of instances allowed
    private static final int MAX_INSTANCES = 5;

    // Counter to keep track of the number of instances created
    private static int instanceCount = 0;

    // List to store the created instances
    private static final List<CustomSingleton> instances = new ArrayList<>();

    // Private constructor to prevent direct instantiation
    private CustomSingleton() {
        System.out.println("New instance created");
    }

    // Static factory method to get an instance
    public static synchronized CustomSingleton getInstance() {
        if (instanceCount < MAX_INSTANCES) {
            CustomSingleton newInstance = new CustomSingleton();
            instances.add(newInstance);
            instanceCount++;
        }
        // Return the last created instance (circularly if needed)
        return instances.get((instanceCount - 1) % MAX_INSTANCES);
    }

    // Optional method to list all created instances
    public static synchronized List<CustomSingleton> getAllInstances() {
        return new ArrayList<>(instances); // Return a copy to avoid modification
    }

    public static void main(String[] args) {
        // Example usage
        CustomSingleton instance1 = CustomSingleton.getInstance();
        CustomSingleton instance2 = CustomSingleton.getInstance();
        CustomSingleton instance3 = CustomSingleton.getInstance();
        CustomSingleton instance4 = CustomSingleton.getInstance();
        CustomSingleton instance5 = CustomSingleton.getInstance();
        CustomSingleton instance6 = CustomSingleton.getInstance();

        System.out.println("Number of instances created: " + CustomSingleton.getAllInstances().size());

        System.out.println("Instance 1: " + instance1.hashCode());
        System.out.println("Instance 1: " + instance5.hashCode());
        System.out.println("Instance 6 (should be same as last one): " + instance6.hashCode());
    }
}

