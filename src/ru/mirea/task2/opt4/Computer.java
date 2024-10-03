package ru.mirea.task2.opt4;

public class Computer {
    private String model;
    private String processor;
    private int ram;  // оперативная память (в гигабайтах)
    private double price;  // цена

    public Computer(String model, String processor, int ram, double price) {
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Модель: " + model + ", Процессор: " + processor +
                ", ОЗУ: " + ram + "GB, Цена: " + price + " руб.";
    }
}
