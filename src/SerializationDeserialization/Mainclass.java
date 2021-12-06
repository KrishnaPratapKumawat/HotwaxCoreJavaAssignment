package SerializationDeserialization;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("please Enter your Number : ");
        try {
            number = sc.nextInt();

            if (number == 1) {
                SerializationTest sTest = new SerializationTest();
                sTest.serialization("C:\\Users\\krish\\IdeaProjects\\CoreJavaAssignment\\src\\SerializationDeserialization\\output1.ser");

            } else if (number == 2) {
                DeserializationTest dTest = new DeserializationTest();
                dTest.desralization("C:\\Users\\krish\\IdeaProjects\\CoreJavaAssignment\\src\\SerializationDeserialization\\output1.ser");
            } else if (number == 3) {
                SerializationTest sTest = new SerializationTest();
                sTest.serialization("C:\\Users\\krish\\IdeaProjects\\CoreJavaAssignment\\src\\SerializationDeserialization\\output2.ser");
            } else if (number == 4) {
                DeserializationTest d = new DeserializationTest();
                d.desralization("C:\\Users\\krish\\IdeaProjects\\CoreJavaAssignment\\src\\SerializationDeserialization\\output2.ser");
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Please enter valid input !");
        }
    }
}
