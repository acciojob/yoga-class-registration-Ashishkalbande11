package com.driver;

public class YogaClassRegistrationApp {
    public static void main(String[] args) {
        YogaClassRegistrationService registrationService = new YogaClassRegistrationService();
        YogaClassRegistrationController registrationController = new YogaClassRegistrationController(registrationService);
        registrationController.processUserInput();
    }
}
