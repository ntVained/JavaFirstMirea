package ru.mirea.task19.opt1;

import java.util.Scanner;

class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            validateINN(inn);
            System.out.println("Заказ успешно оформлен для " + fullName + " с ИНН " + inn);
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateINN(String inn) throws InvalidINNException {
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidINNException("Недействительный ИНН: " + inn);
        }
    }
}