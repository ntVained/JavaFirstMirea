package ru.mirea.task2.opt4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private ArrayList<Computer> computers;  // массив для хранения компьютеров

    public Shop() {
        computers = new ArrayList<>();
    }

    // Метод добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer.getModel());
    }

    // Метод удаления компьютера по имени модели
    public void removeComputer(String model) {
        boolean removed = false;
        for (Computer computer : computers) {
            if (computer.getModel().equalsIgnoreCase(model)) {
                computers.remove(computer);
                System.out.println("Компьютер удалён: " + model);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Компьютер с моделью " + model + " не найден.");
        }
    }

    // Метод поиска компьютеров по параметрам
    public void searchComputer(String processor, int minRam, double maxPrice) {
        boolean found = false;
        for (Computer computer : computers) {
            if (computer.getProcessor().equalsIgnoreCase(processor) &&
                    computer.getRam() >= minRam && computer.getPrice() <= maxPrice) {
                System.out.println(computer);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Компьютер не найден по заданным параметрам.");
        }
    }

    // Метод для отображения всех компьютеров
    public void listComputers() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
        } else {
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }
}
