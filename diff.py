import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double difference = num1 - num2;

        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + difference);

        scanner.close();
    }
}

