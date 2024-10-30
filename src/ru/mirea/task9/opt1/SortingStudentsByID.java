package ru.mirea.task9.opt1;

public class SortingStudentsByID {
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getId() > key.getId()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}