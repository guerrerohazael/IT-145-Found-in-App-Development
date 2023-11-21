//Daniel Guerrero 10/09/2023

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for wall height and width
        double wallHeight = getValidDoubleInput(scanner, "Enter wall height (feet): ");
        double wallWidth = getValidDoubleInput(scanner, "Enter wall width (feet): ");

        // Calculate wall area
        double wallArea = calculateWallArea(wallHeight, wallWidth);

        // Calculate the amount of paint needed in gallons
        double gallonsPaintNeeded = calculatePaintNeeded(wallArea);

        // Calculate the number of cans needed, rounded up to the nearest integer
        int cansNeeded = calculateCansNeeded(gallonsPaintNeeded);

        // Display the results to the user
        System.out.println("Wall area: " + wallArea + " square feet");
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }

    // Function to get valid double input from the user
    private static double getValidDoubleInput(Scanner scanner, String prompt) {
        double value = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);

            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();

                // Check if the entered value is positive
                if (value > 0) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a positive number.");
                }
            } else {
                scanner.next(); // Consume invalid input
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return value;
    }

    // Function to calculate the wall area
    private static double calculateWallArea(double height, double width) {
        return height * width;
    }

    // Function to calculate the amount of paint needed in gallons
    private static double calculatePaintNeeded(double wallArea) {
        final double squareFeetPerGallon = 350.0;
        return wallArea / squareFeetPerGallon;
    }

    // Function to calculate the number of cans needed, rounded up to the nearest integer
    private static int calculateCansNeeded(double gallonsNeeded) {
        return (int) Math.ceil(gallonsNeeded);
    }
}
