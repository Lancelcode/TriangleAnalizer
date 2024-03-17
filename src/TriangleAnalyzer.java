import java.util.Scanner;

public class TriangleAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();

        // Test if it's a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("Valid triangle");

            // Determine triangle type
            java.lang.String triangleType;
            if (side1 == side2 && side1 == side3) {
                triangleType = "equilateral";
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                triangleType = "isosceles";
            } else {
                triangleType = "scalene";
            }

            // Calculate perimeter
            double perimeter = side1 + side2 + side3;

            // Display triangle type and perimeter
            System.out.println("Triangle type: " + triangleType);
            System.out.println("Perimeter: " + perimeter);
        } else {
            System.out.println("Not a valid triangle");
        }
    }

    // Method to check if it's a valid triangle
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }
}

