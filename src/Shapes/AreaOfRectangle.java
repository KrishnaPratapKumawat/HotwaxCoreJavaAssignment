package Shapes;

import java.util.Scanner;

class CalculateOfRectangle {
    double area_rectangle, perimeter_rectangle;

    void areaOfRect(double length, double width) {
        area_rectangle = width * length;
        perimeter_rectangle = 2 * (length + width);
    }
}

public class AreaOfRectangle extends CalculateOfRectangle {
    public void perimeterOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number find the Rectangle Size :-");

        try {
            System.out.println("Put the first value:-");
            double high = sc.nextDouble();

            System.out.println("Put the Secound value:-");
            double wid = sc.nextDouble();

            if (high > 0 || wid > 0) {
                areaOfRect(high, wid);
            }
            else System.out.println("Please Enter A Correct Number!");

        } catch (Exception e) {
            System.out.println("Please Enter a valid Input !");
        }
        System.out.println(" Area of Rectangle:-" + area_rectangle);
        System.out.print(".......................................\n");
        System.out.println(" perimeter of Rectangle:-" + perimeter_rectangle);
    }
}
