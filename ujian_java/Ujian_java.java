/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujian_java;

import java.util.Scanner;

/**
 *
 * @author anonymous
 */
public class Ujian_java {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student
        System.out.print("Masukkan nama siswa: ");
        String studentName = scanner.nextLine();
        System.out.print("Masukkan alamat siswa: ");
        String studentAddress = scanner.nextLine();

        // Input for Teacher
        System.out.print("Masukkan nama dosen: ");
        String teacherName = scanner.nextLine();
        System.out.print("Masukkan alamat dosen: ");
        String teacherAddress = scanner.nextLine();

        // Testing the classes
        Student student = new Student(studentName, studentAddress);
        student.addCourseGrade("Programming", 90);
        student.addCourseGrade("Jaringan", 85);
        System.out.println("\nNilai siswa:");
        student.printGrade();
        System.out.println("Rata-rata nilai: " + student.getAverageGrade());

        Teacher teacher = new Teacher(teacherName, teacherAddress);
        System.out.println("\nMata kuliah yang diajarkan:");
        System.out.println(teacher.addCourse("Programming") ? "Programming" : "Gagal menambahkan Programming"); // true
        System.out.println(teacher.addCourse("Jaringan") ? "Jaringan" : "Gagal menambahkan Jaringan"); // true
        System.out.println(teacher.addCourse("DBMS") ? "DBMS" : "Gagal menambahkan DBMS"); // true
        System.out.println(teacher.addCourse("Programming") ? "Programming" : "Gagal menambahkan Programming"); // false
        teacher.removeCourse("DBMS"); // Correcting the typo
        System.out.println(teacher.removeCourse("Pentest") ? "Berhasil menghapus Pentest" : "Gagal menghapus Pentest"); // false

        scanner.close();
    }
}
