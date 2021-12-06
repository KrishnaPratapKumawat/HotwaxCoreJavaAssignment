package SerializationDeserialization;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SerializationTest {

   void serialization(String file){
       Scanner sc = new Scanner(System.in);
       try {
           System.out.print("Enter FirstName :");
           String strName = sc.nextLine();
           System.out.println();
           System.out.print("Enter DOB :");
           String strDob = sc.nextLine();
           SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
           Date d = dFormat.parse(strDob);
               System.out.println();
           System.out.print("Enter City :");
           String strCity = sc.nextLine();
           System.out.println();

           System.out.print("Enter State :");
           String strState = sc.nextLine();
           System.out.println();

           System.out.print("Enter PinCode :");
           Integer pinCode = sc.nextInt();
           System.out.println();

           sc.nextLine();
           System.out.print("Enter Country : ");
           String strCountry = sc.nextLine();
           System.out.println();


           AddressModel addressModel = new AddressModel(strCity,strState,pinCode,strCountry);
           StudentModel studentModel = new StudentModel(strName,d,addressModel);

           FileOutputStream fileOut = new FileOutputStream(file);
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(studentModel);
           out.close();
           fileOut.close();
           System.out.print("Serialized-date-is-saved-in/tmp/employee.ser");
       }catch (Exception e){
           e.printStackTrace();
       }
   }
}
