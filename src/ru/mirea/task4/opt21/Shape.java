package ru.mirea.task4.opt21;

import ru.mirea.task2.opt3.Point;

abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getColor();
    public abstract String getPosition();

    @Override
    public String toString() {
        return "Type: " + getType() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\nColor: " + getColor() + "\nPosition: " + getPosition() + "\n";
    }
}

class Circle extends Shape {
    private double radius;
    private String color;
    private Point position;
    public Circle(double radius, String color, Point position) {
        this.radius = radius;
        this.color = color;
        this.position = position;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPosition() {
        return "(" + position.getX() + ";" + position.getY() + ")";
    }
}

class Rectangle extends Shape {
    private double width, height;
    private String color;
    private Point position;

    public Rectangle(double width, double height, String color, Point position) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.position = position;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPosition() {
        return "(" + position.getX() + ";" + position.getY() + ")";
    }
}

class Square extends Rectangle {
    public Square(double side, String color, Point position) {
        super(side, side, color, position);
    }
    @Override
    public String getType() {
        return "Square";
    }
}