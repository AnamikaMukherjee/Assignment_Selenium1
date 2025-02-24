package example;

public class Method {// 1. Method to print a welcome message
    public static void printMessage() {
        System.out.println("Welcome to the Java");
    }

    // 2. Method to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Overloaded method to calculate the sum of three integers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to calculate the sum of two double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // 3. Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        // Calling printMessage method
        printMessage();

        // Calling sum methods
        System.out.println("Sum of 5 and 10: " + sum(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + sum(5, 10, 15));
        System.out.println("Sum of 5.5 and 2.3: " + sum(5.5, 2.3));

        // Calling isEven method
        int number = 8;
        System.out.println(number + " is even: " + isEven(number));

        number = 7;
        System.out.println(number + " is even: " + isEven(number));
    }

}
