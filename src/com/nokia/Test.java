package com.nokia;

import java.util.Objects;

public class Test {
	private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override the equals() method
    @Override
    public boolean equals(Object o) {
        // Check if the current object is compared with itself
        if (this == o) return true;

        // Check if the object is an instance of Person
        if (o == null || getClass() != o.getClass()) return false;

        // Typecast o to Person so we can compare data members
        Test person = (Test) o;

        // Compare name and age for equality
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override the hashCode() method
    @Override
    public int hashCode() {
        // Use Objects.hash() to generate a combined hash code based on name and age
        return Objects.hash(name, age);
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Test the equals() and hashCode() implementations
    	Test person1 = new Test("John", 25);
    	Test person2 = new Test("John", 25);
    	Test person3 = new Test("Jane", 30);

        // Check equality
        System.out.println("person1 equals person2: " + person1.equals(person2)); // true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // false

        // Check hash codes
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());
    }

}
