package ru.mirea.task19.opt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LabClass {
    private List<Student> students;

    public LabClass() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortStudents() {
        Collections.sort(students);
    }

    public Student findStudentByName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО " + fullName + " не найден.");
    }

    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        Scanner scanner = new Scanner(System.in);

        labClass.addStudent(new Student("Даниил Сапожков", 4.5));
        labClass.addStudent(new Student("Вячеслав Николаев", 3.8));
        labClass.addStudent(new Student("Арина Иванова", 4.2));

        labClass.sortStudents();

        System.out.print("Введите ФИО студента для поиска: ");
        String searchName = scanner.nextLine();

        try {
            Student foundStudent = labClass.findStudentByName(searchName);
            System.out.println("Найден студент: " + foundStudent);
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}