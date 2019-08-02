package com.example.demo;

public class Student {


    private Long id;
    private String studentName;
    private int studentNumber;

    public Student() {
    }

    public Student(Long id, String studentName, int studentNumber) {
        this.id = id;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }
}

