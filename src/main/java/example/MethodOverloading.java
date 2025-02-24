package example;

public class MethodOverloading {
    // 1. multiply() method for two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2. multiply() method for three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 3. multiply() method for two double values
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Testing multiply methods
        System.out.println("Multiplication of 4 and 5: " + multiply(4, 5));
        System.out.println("Multiplication of 2, 3, and 4: " + multiply(2, 3, 4));
        System.out.println("Multiplication of 2.5 and 4.2: " + multiply(2.5, 4.2));
    }
}
