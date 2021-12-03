package Shapes;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1.CIRCLE & CIRCUMFERENCE:-");
            System.out.println("2.Rectangle :-");
            System.out.println("3.Triangle :-");
            System.out.println("4.SQUARE :-");
            System.out.println("5.Sphere :-");
            System.out.println("6.Cylinder :-");
            System.out.println("7. Exit");
            System.out.println(" ");
            System.out.println("Choose A Number You Want:-");
            num = sc.nextInt();

            try {
                switch (num) {
                    case 1:
                        AreaOfCircumferenceCircle acc = new AreaOfCircumferenceCircle(); //create a obj
                        acc.areaOfCircle();//call method
                        break;

                    case 2:
                        AreaOfRectangle ac = new AreaOfRectangle();
                        ac.perimeterOfRectangle();
                        break;

                    case 3:
                        AreaOfTriangle aot = new AreaOfTriangle();//create a obj
                        aot.calculateOfTriangle();//call method
                        break;

                    case 4:
                        AreaOfSquare aos = new AreaOfSquare();//create a obj
                        aos.areaOfCalculateSquare();//call method
                        break;

                    case 5:
                        AreaOfSphere as = new AreaOfSphere();//create a obj
                        as.sphere();//call method
                        break;

                    case 6:
                        AreaOfCylinder aoc = new AreaOfCylinder();
                        aoc.perimeterOfCylinder();
                        break;

                    case 7:
                        System.exit(0);
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: " + num);


                }


            } catch (Exception e)//exception handle
            {
                System.out.println("Please Enter A Correct Value ! ");
            }

        }


    }
}
