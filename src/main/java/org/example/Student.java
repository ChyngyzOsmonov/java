package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final int EDUCATION_LENGTH = 4;
    private int age;
    private int grade;
    private String name;
    private StudentType studentType;

    public Student(int age, int grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name.substring(0, 5) + "\nAge: " + age + "\nGrade: " + grade;
    }
}
