/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujian_java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anonymous
 */
public class Teacher extends Person {
    private int numCourse = 0;
    private String[] courses = new String[10]; // assuming initial capacity of 10 courses

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourse; i++) {
            if (courses[i].equals(course)) {
                return false; // Course already exists
            }
        }
        if (numCourse >= courses.length) {
            return false; // No more space to add course
        }
        courses[numCourse++] = course;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourse; i++) {
            if (courses[i].equals(course)) {
                courses[i] = courses[numCourse - 1];
                courses[numCourse - 1] = null;
                numCourse--;
                return true;
            }
        }
        return false; // Course not found
    }
}
