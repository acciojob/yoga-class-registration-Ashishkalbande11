package com.driver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YogaClassRegistrationService {
    private Map<String, YogaClass> yogaClasses;

    public YogaClassRegistrationService() {
        this.yogaClasses = new HashMap<>();
    }

    public void registerStudent(StudentDTO studentDTO, YogaClassDTO yogaClassDTO) {
    	//your code goes here
        YogaClass yogaClass = yogaClasses.get(yogaClassDTO.getClassCode());
        if(yogaClass != null){
            Student student = new Student(studentDTO.getStudentName(), studentDTO.getEmail());
            yogaClass.enrollStudent(student);
            System.out.println("Registration successful for "+student.getStudentName()+" in "+ yogaClass.getFormType()+" class!");
        }else{
            System.out.println("Invalid class code.");
        }
    }

    public void addYogaClass(YogaClassDTO yogaClassDTO) {
    	//your code goes here
        YogaClass yogaClass = new YogaClass(yogaClassDTO.getClassCode(), yogaClassDTO.getInstructor(), yogaClassDTO.getMaxCapacity(), yogaClassDTO.getFormType());
        yogaClasses.put(yogaClassDTO.getClassCode(), yogaClass);
        System.out.println("Yoga class added successfully.");
    }

    public void displayEnrolledStudents(String classCode) {
        //your code goes here
        YogaClass yogaClass = yogaClasses.get(classCode);
        if(yogaClass != null){
            System.out.println("Enrolled students in "+yogaClass.getFormType()+" - " + "class:");
            for(Student student : yogaClass.getEnrolledStudents()){
                System.out.println(student.getStudentName()+" - "+ student.getEmail());
            }
        }else{
            System.out.println("Invalid class code.");
        }
    }
}
