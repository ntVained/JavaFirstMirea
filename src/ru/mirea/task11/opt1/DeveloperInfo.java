package ru.mirea.task11.opt1;

import java.util.Date;
import java.util.Random;

public class DeveloperInfo {
    public static void main(String[] args) {
        String developerLastName = "Ivanov";

        Date assignmentDate = new Date();

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentDate);

        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(3000,10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date submissionDate = new Date();

        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}