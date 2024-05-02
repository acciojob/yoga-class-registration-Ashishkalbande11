package com.driver;

public class StudentDTO {
    private String studentName;
    private String email;

    public StudentDTO(String studentName, String email) {
        this.studentName = studentName;
        this.email = email;
    }

    public String getStudentName() {
    	//your code goes here
        return studentName;
    }

    public String getEmail() {
    	//your code goes here
        return email;
    }
}
