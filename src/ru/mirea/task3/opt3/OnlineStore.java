package ru.mirea.task3.opt3;

import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"Товар 1", "Товар 2", "Товар 3"};
        double[] prices = {1000.00, 2000.00, 3000.00};

        System.out.println("Выберите товар для покупки:");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %s - %.2f RUB\n", (i + 1), items[i], prices[i]);
        }

        int choice = scanner.nextInt() - 1;
        if (choice < 0 || choice >= items.length) {
            System.out.println("Неверный выбор товара.");
            return;
        }

        System.out.println("Вы выбрали: " + items[choice]);
        double priceInRub = prices[choice];

        System.out.println("Выберите валюту для оплаты (RUB, USD, EUR): ");
        String currency = scanner.next().toUpperCase();

        // Конвертируем цену в выбранную валюту
        double finalPrice;
        switch (currency) {
            case "USD":
                finalPrice = CurrencyConverter.convert("RUB", "USD", priceInRub);
                System.out.printf("Стоимость покупки: %.2f USD\n", finalPrice);
                break;
            case "EUR":
                finalPrice = CurrencyConverter.convert("RUB", "EUR", priceInRub);
                System.out.printf("Стоимость покупки: %.2f EUR\n", finalPrice);
                break;
            case "RUB":
                System.out.printf("Стоимость покупки: %.2f RUB\n", priceInRub);
                break;
            default:
                System.out.println("Неверная валюта.");
        }
        scanner.close();
    }
}
