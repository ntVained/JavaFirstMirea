package ru.mirea.task9.opt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudentSortByGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            students.add(new Student(id, name, gpa));
        }

        System.out.println("\nBefore sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.size() - 1);

        System.out.println("\nAfter sorting by GPA (descending):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}