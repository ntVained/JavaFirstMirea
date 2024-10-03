package ru.mirea.task4.opt21;

import ru.mirea.task2.opt3.Point;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(4,"yellow", new Point(1,2));
        Shape rectangle = new Rectangle(2, 7, "red", new Point(4,7));
        Shape square = new Square(6, "blue", new Point(0,0));

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}