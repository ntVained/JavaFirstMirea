package ru.mirea.task2.opt3;

import java.util.Scanner;

public class CircleTester {
    private Circle[] circles;
    private int numCircles;

    public CircleTester(int maxCircles) {
        circles = new Circle[maxCircles];
        numCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numCircles < circles.length) {
            circles[numCircles++] = circle;
        } else {
            System.out.println("Достигнут максимум кругов");
        }
    }

    public void printCircles() {
        for (int i = 0; i < numCircles; i++) {
            Circle circle = circles[i];
            Point center = circle.getCenter();
            System.out.printf("Круг %d: Центр (%.2f, %.2f), Радиус: %.2f%n",
                    i + 1, center.getX(), center.getY(), circle.getRadius());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество кругов ");
        int numCircles = sc.nextInt();
        CircleTester tester = new CircleTester(numCircles);
        for (int i = 0; i < numCircles; i++) {
            System.out.print("Введите x для центра круга №" + (i + 1) + ": ");
            int x = sc.nextInt();
            System.out.print("Введите y для центра круга №" + (i + 1) + ": ");
            int y = sc.nextInt();
            System.out.print("Введите радиус круга №" + (i + 1) + ": ");
            tester.addCircle(new Circle(new Point(x,y), sc.nextInt()));
        }
        tester.printCircles();
        sc.close();
    }
}
