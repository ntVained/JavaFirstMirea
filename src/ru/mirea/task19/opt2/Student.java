package ru.mirea.task19.opt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class Student implements Comparable<Student> {
    private String fullName;
    private double averageGrade;

    public Student(String fullName, double averageGrade) {
        this.fullName = fullName;
        this.averageGrade = averageGrade;
    }

    public String getFullName() {
        return fullName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.averageGrade, other.averageGrade);
    }

    @Override
    public String toString() {
        return fullName + " (Средний балл: " + averageGrade + ")";
    }
}