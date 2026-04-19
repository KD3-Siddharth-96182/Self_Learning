package com.sunbeam;

public class Tester {
    public static void main(String[] args) {

        Address addr = new Address("Pune", "MH");

        Student s1 = new Student(1, "Amit", addr);

        Student shallowCopy = new Student(s1);

        Student deepCopy = new Student(s1, true);

        System.out.println("Before Change:");
        System.out.println("Original: " + s1);
        System.out.println("Shallow: " + shallowCopy);
        System.out.println("Deep: " + deepCopy);

        s1.getAddress().setCity("Mumbai");

        System.out.println("\nAfter Change:");
        System.out.println("Original: " + s1);
        System.out.println("Shallow: " + shallowCopy);
        System.out.println("Deep: " + deepCopy);
    }
}