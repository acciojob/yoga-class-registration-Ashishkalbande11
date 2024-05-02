package com.driver;

import java.util.ArrayList;
import java.util.List;

public class YogaClass {
    private String classCode;
    private String instructor;
    private int maxCapacity;
    private String formType;
    private List<Student> enrolledStudents;

    public YogaClass(String classCode, String instructor, int maxCapacity, String formType) {
        this.classCode = classCode;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.formType = formType;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getClassCode() {
    	//your code goes here
        return classCode;
    }

    public String getInstructor() {
    	//your code goes here
        return instructor;
    }

    public int getMaxCapacity() {
    	//your code goes here
        return maxCapacity;
    }

    public String getFormType() {
    	//your code goes here
        return formType;
    }

    public List<Student> getEnrolledStudents() {
    	//your code goes here
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
    	//your code goes here
    }
}
