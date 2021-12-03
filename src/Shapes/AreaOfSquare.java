package Shapes;

import java.util.Scanner;

class CalculationOfSquare {

    double area_square;
    double perimeter_square;

    void calculateAreaAndPerimeterOfSquare(double square) {
        area_square = square * square;
        perimeter_square = 4 * square;
    }
}
public class AreaOfSquare extends CalculationOfSquare {
    public void areaOfCalculateSquare() {

        System.out.print("Enter A Area of Square :- ");
        try {
            Scanner sc = new Scanner(System.in);
            double S = sc.nextDouble();

            if (S > 0) {calculateAreaAndPerimeterOfSquare(S);}

            else{ System.out.println("Please Enter A  Correct Number");}

        }catch (Exception e){
            System.out.println("Please Enter a valid Input!");
        }

        System.out.println("It is a area of Square :-" + area_square);
        System.out.print(".......................................................\n");
        System.out.println("It is a area of perimeter_Square :-" + perimeter_square);
    }

}
