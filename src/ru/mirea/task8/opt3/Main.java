package ru.mirea.task8.opt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.println(i);
            }
        }
    }
}