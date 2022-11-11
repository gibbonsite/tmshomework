package com.paliashchuk.tms.javahometask10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class University {
    private String name;
    private List<Student> students;
    private Optional<Double> rating;

    public University(String name, List<Student> students) {
        this.name = name;
        this.students = new ArrayList<>(students);
        rating = calculateRating(students);
    }

    public void addStudent(Student student) {
        students.add(student);
        rating = calculateRating(students);
    }

    public Optional<Student> findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public boolean removeStudentByName(String name) {
        Optional<Student> student = findStudentByName(name);
        if (student.isPresent()) {
            students.remove(student.get());
            rating = calculateRating(students);
        }
        return student.isPresent();
    }

    private Optional<Double> calculateRating(List<Student> students) {
        double currentRating = 0;
        int count = 0;
        for (Student student : students) {
            for (Integer mark : student.getMarks()) {
                currentRating += mark;
                count++;
            }
        }
        if (count > 0) {
            return Optional.of(currentRating / count);
        } else {
            return Optional.empty();
        }
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return List.copyOf(students);
    }

    public Optional<Double> getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", students=" + students +
                ", rating=" + (rating.isPresent() ? rating.get() : "(not available)") +
                '}';
    }
}
