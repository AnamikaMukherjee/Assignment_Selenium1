package example;

import java.util.Scanner;

public class Loops {

    // 1. Print numbers from 1 to 20 using a for loop
    public static void printNumbers() {
        System.out.println("Numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // 2. Print even numbers between 1 to 50 using a while loop
    public static void printEvenNumbers() {
        System.out.println("Even numbers between 1 to 50:");
        int i = 2; // Start from 2 as it's the first even number
        while (i <= 50) {
            System.out.print(i + " ");
            i += 2; // Increment by 2 to get only even numbers
        }
        System.out.println("\n");
    }

    // 3. Print the sum of all numbers from 1 to 100 using a do-while loop
    public static void sumNumbers() {
        int sum = 0, i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("Sum of numbers from 1 to 100: " + sum + "\n");
    }

    // 4. Reverse the digits of an input number using a while loop
    public static void reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit
        }
        System.out.println("Reversed number: " + reversed + "\n");
    }

    // 5. Calculate the sum of digits of an input number using a while loop
    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Extract and add last digit
            num /= 10; // Remove last digit
        }
        System.out.println("Sum of digits: " + sum + "\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Call methods for different tasks
        printNumbers();
        printEvenNumbers();
        sumNumbers();

        // Take input for number reversal
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        reverseNumber(number);

        // Take input for sum of digits calculation
        System.out.print("Enter a number to calculate sum of digits: ");
        int num = scanner.nextInt();
        sumOfDigits(num);

        scanner.close();
    }
}
