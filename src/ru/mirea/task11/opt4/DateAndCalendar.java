package ru.mirea.task11.opt4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных пользователем
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        String dateTimeString = String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = null;
        try {
            date = dateFormat.parse(dateTimeString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes); // Месяцы в Calendar начинаются с 0 (январь)

        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());

        scanner.close();
    }
}