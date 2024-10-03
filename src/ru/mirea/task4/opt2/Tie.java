package ru.mirea.task4.opt2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину: Галстук, Размер: " + size + ", Цена: " + price + ", Цвет: " + color);
    }
}
