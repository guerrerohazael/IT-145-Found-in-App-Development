//Daniel Guerrero 10/05/2023  

import java.util.Scanner;

public class Paint1 {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);

        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        final double squareFeetPerGallon = 350.0;

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            try {
                System.out.print("Enter wall height (feet): ");

                wallHeight = parseDouble(scnr.nextLine());

                // Check if wallHeight is less than or equal to 0
                if (!(wallHeight > 0)) {
                    throw new Exception("Invalid Height: Height must be greater than 0");
                }
            } catch (Exception e) {
                System.out.println("Exception Occurred --> " + e.getMessage());
            }
        } while (!(wallHeight > 0));

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            try {
                System.out.print("Enter wall width (feet): ");

                wallWidth = parseDouble(scnr.nextLine());

                // Check if wallWidth is less than or equal to 0
                if (!(wallWidth > 0)) {
                    throw new Exception("Invalid Width: Width must be greater than 0");
                }
            } catch (Exception e) {
                System.out.println("Exception Occurred --> " + e.getMessage());
            }
        } while (!(wallWidth > 0));

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallon;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
    }

    // Custom function to parse double from input (handles numeric words)
    private static double parseDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            // Handle numeric words here
            switch (input.toLowerCase()) {
                case "one":
                    return 1.0;
                case "two":
                    return 2.0;
                // Add more cases for other numeric words as needed
                default:
                    return -1.0; // Invalid input
            }
        }
    }
}
