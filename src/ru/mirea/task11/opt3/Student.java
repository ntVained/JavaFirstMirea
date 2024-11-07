package ru.mirea.task11.opt3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class Student {
    private String name;
    private int age;
    private LocalDate birthDate;

    public Student(String name, int age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + formatBirthDate(FormatStyle.MEDIUM) +
                '}';
    }

    public String formatBirthDate(FormatStyle style) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(style);
        return birthDate.format(formatter);
    }

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 5, 15);
        Student student = new Student("John Doe", 23, birthDate);

        System.out.println(student);
        System.out.println("Short format: " + student.formatBirthDate(FormatStyle.SHORT));
        System.out.println("Medium format: " + student.formatBirthDate(FormatStyle.MEDIUM));
        System.out.println("Long format: " + student.formatBirthDate(FormatStyle.LONG));
        System.out.println("Full format: " + student.formatBirthDate(FormatStyle.FULL));
    }
}