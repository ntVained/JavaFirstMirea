package ru.mirea.task8.opt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int s = scanner.nextInt();

        int CountNums = 0;
        for (int i = (int) Math.pow(10, k - 1); i < Math.pow(10, k); i++) {
            int CountSum = 0;
            int num = i;
            for (int j = 0; j < k; j++) {
                CountSum += num % 10;
                num /= 10;
            }
            if (CountSum == s) CountNums++;
        }
        System.out.println(CountNums);
    }
}