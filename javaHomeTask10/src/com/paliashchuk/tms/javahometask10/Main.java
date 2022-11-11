package com.paliashchuk.tms.javahometask10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student andrew = new Student(18, "Andrew", List.of(8, 9, 8, 9, 10, 9));
        Student paul = new Student(19, "Paul", List.of(8, 8, 8, 9, 8, 7, 8));
        Student olga = new Student(19, "Olga", List.of(9, 10, 9, 10, 10));
        University university = new University("Belarussian State University", List.of(andrew, paul, olga));
        university.addStudent(new Student(20, "Alex", List.of(10, 7, 8, 8, 7, 10, 9)));
        System.out.println(university);
        System.out.println(university.findStudentByName("Paul").
                get());
        System.out.println(university.removeStudentByName("Paul"));
    }
}
