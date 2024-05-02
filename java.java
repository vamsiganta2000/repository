import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Multiply the numbers
        double result = num1 * num2;

        // Output the result
        System.out.println("The result of multiplication is: " + result);

        // Close the scanner
        scanner.close();
    }
}
