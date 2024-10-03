package ru.mirea.task4.opt2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину: Футболка, Размер: " + size + ", Цена: " + price + ", Цвет: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину: Футболка, Размер: " + size + ", Цена: " + price + ", Цвет: " + color);
    }
}
