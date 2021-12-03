package Shapes;

import java.util.*;

class AreaOfCalculation {
    double area, circumference;

    void Circle(double r) {
        area = 3.14 * r * r;
        circumference = 3.14 * 2 * r;
    }
}
public class AreaOfCircumferenceCircle extends AreaOfCalculation {
    public void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Radius :-  ");
        try {
            double radius = sc.nextDouble();

            if (!(radius > 0)) {
                System.out.println("Please Enter A Correct Number !");
            } else {
                Circle(radius);// call method
            }

        } catch (Exception e) {
            System.out.println("Please Enter a valid Input !");
        }
        System.out.println("It is a area of Circle :-  " + area + "\n");
        System.out.print(".......................................................\n");
        System.out.println( "Then Circumference of the circle :-  " + circumference);


    }
}
