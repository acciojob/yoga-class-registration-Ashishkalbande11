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
    }

    private void registerStudent(Scanner scanner) {
    	//your code goes here
    }

    private void addYogaClass(Scanner scanner) {
    	//your code goes here
    }

    private void displayEnrolledStudents(Scanner scanner) {
    	//your code goes here
    }
    public static void main(String[] args) {
        // Create necessary objects and start the application
        YogaClassRegistrationService registrationService = new YogaClassRegistrationService();
        YogaClassRegistrationController registrationController = new YogaClassRegistrationController(registrationService);

        // Start processing user input
        registrationController.processUserInput();
    }
}

