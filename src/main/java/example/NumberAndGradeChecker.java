package example;

import java.util.Scanner;

public class NumberAndGradeChecker {
    // Method to check if a number is even or odd, and positive, negative, or zero
    public static void checkNumber(int num) {
        // Checking even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        // Checking positive, negative, or zero
        if (num > 0) {
            System.out.println(num + " is Positive.");
        } else if (num < 0) {
            System.out.println(num + " is Negative.");
        } else {
            System.out.println(num + " is Zero.");
        }
    }

    // Method to assign a grade based on marks
    public static void assignGrade(int marks) {
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for number checking
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        checkNumber(num);

        // Taking input for grade assignment
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();
        assignGrade(marks);

        // Close the scanner
        scanner.close();
    }
}
