package ru.mirea.task6.opt1;

public class MovableTester {
    public static void main(String[] args) {
        try {
            MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 3, 1, 1);
            System.out.println(rectangle);

            rectangle.moveRight();
            System.out.println(rectangle);

            rectangle.moveDown();
            System.out.println(rectangle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            MovableCircle circle = new MovableCircle(0, 0, 4, 3, 2);
            System.out.println(circle);

            circle.moveRight();
            System.out.println(circle);

            circle.moveDown();
            System.out.println(circle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
