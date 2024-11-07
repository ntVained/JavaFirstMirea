package ru.mirea.task11.opt2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date currentDate = new Date();

        System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));

        System.out.print("Введите дату и время в формате 'yyyy-MM-dd HH:mm:ss': ");
        String userInput = scanner.nextLine();

        try {
            Date userDate = dateFormat.parse(userInput);

            if (currentDate.before(userDate)) {
                System.out.println("Текущая дата и время раньше введенной даты и времени.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Текущая дата и время позже введенной даты и времени.");
            } else {
                System.out.println("Текущая дата и время совпадают с введенной датой и временем.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты и времени.");
        }
    }
}