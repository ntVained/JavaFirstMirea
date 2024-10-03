package ru.mirea.task2.opt4;

import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Поиск компьютера");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выход");
            System.out.print("Выберите опцию: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите модель: ");
                    String model = scanner.nextLine();
                    System.out.print("Введите процессор: ");
                    String processor = scanner.nextLine();
                    System.out.print("Введите объем ОЗУ (GB): ");
                    int ram = scanner.nextInt();
                    System.out.print("Введите цену: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Computer computer = new Computer(model, processor, ram, price);
                    shop.addComputer(computer);
                    break;
                case 2:
                    System.out.print("Введите модель компьютера для удаления: ");
                    String removeModel = scanner.nextLine();
                    shop.removeComputer(removeModel);
                    break;
                case 3:
                    System.out.print("Введите процессор для поиска: ");
                    String searchProcessor = scanner.nextLine();
                    System.out.print("Введите минимальный объем ОЗУ (GB): ");
                    int searchRam = scanner.nextInt();
                    System.out.print("Введите максимальную цену: ");
                    double searchPrice = scanner.nextDouble();
                    scanner.nextLine();  // очистка буфера
                    shop.searchComputer(searchProcessor, searchRam, searchPrice);
                    break;
                case 4:
                    shop.listComputers();
                    break;
                case 5:
                    running = false;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
        scanner.close();
    }
}
