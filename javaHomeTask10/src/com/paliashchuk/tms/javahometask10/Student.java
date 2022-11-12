package com.paliashchuk.tms.javahometask10;

import java.util.List;

public final class Student {
    private int age;
    private String name;
    private List<Integer> marks;

    public Student(int age, String name, List<Integer> marks) {
        this.age = age;
        this.name = name;
        this.marks = List.copyOf(marks);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return List.copyOf(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
