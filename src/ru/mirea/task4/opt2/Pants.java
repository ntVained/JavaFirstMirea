package ru.mirea.task4.opt2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину: Штаны, Размер: " + size + ", Цена: " + price + ", Цвет: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину: Штаны, Размер: " + size + ", Цена: " + price + ", Цвет: " + color);
    }
}
