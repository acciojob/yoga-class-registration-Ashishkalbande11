package com.driver;

import java.util.Scanner;

public class YogaClassRegistrationController {
    private YogaClassRegistrationService registrationService;

    public YogaClassRegistrationController(YogaClassRegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerStudent(scanner);
                    break;
                case 2:
                    addYogaClass(scanner);
                    break;
                case 3:
                    displayEnrolledStudents(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void printMenu() {
    	//your code goes here
        System.out.println("1. Register student for a yoga class");
        System.out.println("2. Add a new yoga class");
        System.out.println("3. Display enrolled students for a yoga class");
        System.out.println("4. Exit");
        System.out.println("5. Enter your choice");
    }

    private void registerStudent(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter student name:");
        String studentName = scanner.next();
        System.out.println("Enter student email:");
        String email = scanner.next();
        StudentDTO studentDTO = new StudentDTO(studentName, email);

        System.out.println("Enter class code:");
        String classCode = scanner.next();
        YogaClassDTO yogaClassDTO = new YogaClassDTO(classCode,"",0,"");
        registrationService.registerStudent(studentDTO,yogaClassDTO);
    }

    private void addYogaClass(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter class code:");
        String classCode = scanner.next();
        System.out.println("Enter instructor name:");
        String instructor = scanner.next();
        System.out.println("Enter max capacity:");
        int maxCapacity = scanner.nextInt();
        System.out.println("Enter form type:");
        String formType = scanner.next();

        YogaClassDTO yogaClassDTO = new YogaClassDTO(classCode, instructor,maxCapacity,formType);
        registrationService.addYogaClass(yogaClassDTO);
    }

    private void displayEnrolledStudents(Scanner scanner) {
    	//your code goes here
        System.out.println("Enter the class code:");
        String classCode = scanner.next();
        registrationService.displayEnrolledStudents(classCode);
    }
    public static void main(String[] args) {
        // Create necessary objects and start the application
        YogaClassRegistrationService registrationService = new YogaClassRegistrationService();
        YogaClassRegistrationController registrationController = new YogaClassRegistrationController(registrationService);

        // Start processing user input
        registrationController.processUserInput();
    }
}

