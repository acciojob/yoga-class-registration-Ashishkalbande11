package com.driver;

public class YogaClassDTO {
    private String classCode;
    private String instructor;
    private int maxCapacity;
    private String formType;

    public YogaClassDTO(String classCode, String instructor, int maxCapacity, String formType) {
        this.classCode = classCode;
        this.instructor = instructor;
        this.maxCapacity = maxCapacity;
        this.formType = formType;
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
}
