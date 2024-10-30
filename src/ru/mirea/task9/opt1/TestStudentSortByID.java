package ru.mirea.task9.opt1;

import java.util.Scanner;

public class TestStudentSortByID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(id, name,gpa);
        }

        System.out.println("\nBefore sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByID.insertionSort(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}