package Shapes;

import java.util.Scanner;

class CalculationOfCylinder {
    double surfaceArea;

    void calculateOfCylinder(double r, double h) {
        surfaceArea = (22 * r * (r + h)) / 7;
    }
}

public class AreaOfCylinder extends CalculationOfCylinder {
    public void perimeterOfCylinder() {
        System.out.println("Enter A Number of cylinder :-");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A Radius Value:");
            double radius = sc.nextDouble();

            System.out.println("Enter A Height Value:");
            double height = sc.nextDouble();

            if (radius > 0 || height > 0) {
                calculateOfCylinder(radius, height);
            } else System.out.println("Please Enter A Correct Number ! ");

        } catch (Exception e) {
            System.out.println("Please Enter a Valid Number! ");
        }
        System.out.println("It is a area of Cylinder :-" + surfaceArea);
    }
}




