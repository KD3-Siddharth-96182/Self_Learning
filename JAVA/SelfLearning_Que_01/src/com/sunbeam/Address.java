package com.sunbeam;

public class Address {
    private String city;
    private String state;

    public Address() {
        this.city = "NA";
        this.state = "NA";
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address(Address other) {
        this.city = other.city;
        this.state = other.state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return city + ", " + state;
    }
}