package Shapes;

import java.util.Scanner;


class CalculationOfTriangle {
    double area_Triangle, perimeter_Triangle;

    void triangle(double breadth, double height)
    {
        area_Triangle = (breadth * height) / 2;
    }

    void perimeterOfTriangle(double breadth, double height, double side) {
        perimeter_Triangle = height + breadth + side;
    }
}

public class AreaOfTriangle extends CalculationOfTriangle {
    public void calculateOfTriangle()//todo create method
    {

        System.out.println("Enter A  Number Area of Triangle :- ");

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter A Breadth value:- ");
            double b = sc.nextDouble();

            System.out.println("Enter A Height value:- ");
            double h = sc.nextDouble();

            System.out.println("Enter A Side value:- ");
            double s = sc.nextDouble();

            if (b > 0 || h > 0) {
                triangle(b, h);
                perimeterOfTriangle(b, h, s);
            } else {
                System.out.println("Please Enter A Correct Number!");
            }

        } catch (Exception e) {
            System.out.println("Please Enter a valid Input ! ");
        }
        System.out.println("Area of triangle is :-" + area_Triangle);
        System.out.print("....................................\n");
        System.out.println("perimeter is :-" + perimeter_Triangle);
    }
}