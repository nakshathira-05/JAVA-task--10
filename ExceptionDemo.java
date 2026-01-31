package com.task10.exception;

import java.util.Scanner;

public class ExceptionDemo {

    // Method that throws checked exception
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        }

        System.out.println("Age validated successfully.");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = Integer.parseInt(scanner.nextLine());

            int result = 100 / number;
            System.out.println("Result: " + result);

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());

            validateAge(age);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter only numbers.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("Program ended safely.");
        }
    }
}
