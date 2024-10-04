package ru.mirea.task4.opt21;

import ru.mirea.task2.opt3.Point;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "blue", false);
        Shape rectangle = new Rectangle(4.0, 6.0, "green", true);
        Shape square = new Square(3.0, "yellow", true);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}