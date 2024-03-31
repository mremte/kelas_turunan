/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_java;

/**
 *
 * @author anonymous
 */
public class Student extends Person {
    private int numCourse = 0;
    private final String[] courses;
    private final int[] grades;
    
    public Student(String name, String address) {
        super(name, address);
        courses = new String[10]; // assuming initial capacity of 10 courses
        grades = new int[10]; // assuming initial capacity of 10 grades
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourse] = course;
        grades[numCourse] = grade;
        numCourse++;
    }

    public void printGrade() {
        System.out.println("Grades for " + getName() + ":");
        for (int i = 0; i < numCourse; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourse == 0)
            return 0.0;

        int sum = 0;
        for (int i = 0; i < numCourse; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourse;
    }
}