package com.sunbeam;

abstract class Shape {
    public abstract double area();
}


abstract class TwoDShape extends Shape {
}


abstract class ThreeDShape extends Shape {
    public abstract double volume();
}


class Circle extends TwoDShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends TwoDShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Sphere extends ThreeDShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}


class Cube extends ThreeDShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double area() {
        return 6 * side * side;
    }

    public double volume() {
        return side * side * side;
    }
}


public class Tester {
	public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Sphere s = new Sphere(3);
        Cube cu = new Cube(2);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());

        System.out.println("Sphere Area: " + s.area());
        System.out.println("Sphere Volume: " + s.volume());

        System.out.println("Cube Area: " + cu.area());
        System.out.println("Cube Volume: " + cu.volume());
    }
}











