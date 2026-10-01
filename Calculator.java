import java.util.Scanner;

public class Calculator {

    // Method for Addition
    static double calculateSum(double first, double second) {
        return first + second;
    }

    // Method for Subtraction
    static double calculateDifference(double first, double second) {
        return first - second;
    }

    // Method for Multiplication
    static double calculateProduct(double first, double second) {
        return first * second;
    }

    // Method for Division
    static double calculateQuotient(double first, double second) {
        return first / second;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- JAVA CONSOLE CALCULATOR ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number (0-4).");
                input.next();
                System.out.print("Choose an option: ");
            }
            option = input.nextInt();

            if (option >= 1 && option <= 4) {
                System.out.print("Enter first number: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a numerical value.");
                    input.next();
                    System.out.print("Enter first number: ");
                }
                double firstValue = input.nextDouble();

                System.out.print("Enter second number: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Invalid input! Please enter a numerical value.");
                    input.next();
                    System.out.print("Enter second number: ");
                }
                double secondValue = input.nextDouble();

                switch (option) {
                    case 1:
                        System.out.println("Answer = " + calculateSum(firstValue, secondValue));
                        break;
                    case 2:
                        System.out.println("Answer = " + calculateDifference(firstValue, secondValue));
                        break;
                    case 3:
                        System.out.println("Answer = " + calculateProduct(firstValue, secondValue));
                        break;
                    case 4:
                        if (secondValue == 0) {
                            System.out.println("Error: Cannot divide a number by zero.");
                        } else {
                            System.out.println("Answer = " + calculateQuotient(firstValue, secondValue));
                        }
                        break;
                }
            } else if (option != 0) {
                System.out.println("Invalid option. Please select again from the menu.");
            }
        } while (option != 0);

        System.out.println("Thank you for using the calculator!");
        input.close();
    }
}
