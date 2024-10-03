package ru.mirea.task4.opt2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину: Юбка, Размер: " + size + ", Цена: " + price + ", Цвет: " + color);
    }
}
