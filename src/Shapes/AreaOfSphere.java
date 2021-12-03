package Shapes;

import java.util.Scanner;

class CalculationOfSphere {
    double area_sphere, volume_sphere;

    void calculateOfSphere(double radius) {
        area_sphere = 4 * 3.141_59 * (radius * radius);
        volume_sphere = (4.0 / 3.0) * Math.PI * (Math.pow(radius, 3));
    }
}

public class AreaOfSphere extends CalculationOfSphere {
    public void sphere()//todo Create a method
    {
        System.out.print("Enter A Radius Of sphere :- ");
        try {
            Scanner sc = new Scanner(System.in);
            double r = sc.nextDouble();

            if (r > 0) {
                calculateOfSphere(r);
            } else {
                System.out.println("Please Enter A Correct Number !");
            }

        } catch (Exception e)//exception handle
        {
            System.out.println("Please Enter a Valid Number! ");
        }
        System.out.println(" area of Sphere :-" + area_sphere);
        System.out.print("................................\n");
        System.out.println("Volume of Sphere :-" + volume_sphere);
    }
}
