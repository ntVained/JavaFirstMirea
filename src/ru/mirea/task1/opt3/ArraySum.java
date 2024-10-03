package ru.mirea.task1.opt3;
import java.util.Scanner;


public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        int i = 0;
        do {
            arr[i] = sc.nextInt();
            i++;
        } while (i < n);

        int sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += arr[i];
            i++;
        } while (i < n);
        System.out.println("Сумма элементов массива (do-while): " + sumDoWhile);

        int sumWhile = 0;
        i = 0;
        while (i < n) {
            sumWhile += arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива (while): " + sumWhile);

        int max = arr[0];
        int min = arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
