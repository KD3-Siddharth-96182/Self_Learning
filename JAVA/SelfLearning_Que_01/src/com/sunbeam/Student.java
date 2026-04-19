package com.sunbeam;

public class Student {
    private int id;
    private String name;
    private Address address;

    public Student() {
        this.id = 0;
        this.name = "NA";
        this.address = new Address();
    }

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.address = other.address;
    }

    public Student(Student other, boolean deepCopy) {
        this.id = other.id;
        this.name = other.name;
        if (deepCopy)
            this.address = new Address(other.address);
        else
            this.address = other.address;
    }

    public Address getAddress() {
        return address;
    }

    public String toString() {
        return id + " " + name + " " + address;
    }
}