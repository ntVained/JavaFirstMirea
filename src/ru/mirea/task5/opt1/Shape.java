package ru.mirea.task5.opt1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
}

class Circle extends Shape {
    private int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}

class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}

class Square extends Rectangle {

    public Square(Color color, int x, int y, int side) {
        super(color, x, y, side, side);
    }
}

class ShapePanel extends JPanel {
    private Shape[] shapes;

    public ShapePanel() {
        shapes = new Shape[20];
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int randomShape = rand.nextInt(3);
            int x = rand.nextInt(300);
            int y = rand.nextInt(300);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Случайный цвет

            switch (randomShape) {
                case 0:
                    int radius = rand.nextInt(50) + 10;
                    shapes[i] = new Circle(color, x, y, radius);
                    break;
                case 1:
                    int width = rand.nextInt(100) + 20;
                    int height = rand.nextInt(100) + 20;
                    shapes[i] = new Rectangle(color, x, y, width, height);
                    break;
                case 2:
                    int side = rand.nextInt(80) + 20;
                    shapes[i] = new Square(color, x, y, side);
                    break;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}