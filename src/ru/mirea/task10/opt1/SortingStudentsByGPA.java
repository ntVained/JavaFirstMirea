package ru.mirea.task10.opt1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    public void setArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter specialty: ");
            String specialty = scanner.nextLine();

            System.out.print("Enter course: ");
            int course = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            System.out.print("Enter group: ");
            String group = scanner.nextLine();

            iDNumber.add(new Student(firstName, lastName, specialty, course, group));
        }
    }

    public void quickSort(Comparator<Student> comparator) {
        quickSort(iDNumber, 0, iDNumber.size() - 1, comparator);
    }

    private void quickSort(List<Student> list, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(list, low, high, comparator);
            quickSort(list, low, pi - 1, comparator);
            quickSort(list, pi + 1, high, comparator);
        }
    }

    private int partition(List<Student> list, int low, int high, Comparator<Student> comparator) {
        Student pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, high);
        return i + 1;
    }

    private void swap(List<Student> list, int i, int j) {
        Student temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray();

        System.out.println("\nBefore sorting:");
        sorter.outArray();

        sorter.quickSort(Comparator.comparing(Student::getCourse).reversed());

        System.out.println("\nAfter sorting by course (descending):");
        sorter.outArray();
    }
}