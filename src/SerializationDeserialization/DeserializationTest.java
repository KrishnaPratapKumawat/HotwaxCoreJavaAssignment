package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {

    void desralization(String file){
        try {
            new StudentModel();
            FileInputStream fileIN = new FileInputStream(file);
            ObjectInputStream objIN  = new ObjectInputStream(fileIN);
            StudentModel studentModel = (StudentModel) objIN.readObject();
            System.out.println("Deserialized Student !");
            System.out.print("Name : "+studentModel.getFirstName());
            System.out.println();
            System.out.print("Date - OF - Birth : "+studentModel.getD());
            System.out.println();
            System.out.print("Address : "+studentModel.getAdd().getCity());
            System.out.println();
            System.out.print("PINCODE : "+studentModel.getAdd().getPinCode());
            System.out.println();
            objIN.close();
            fileIN.close();
        } catch (Exception e){
            System.out.println("Class Not Found");
            e.printStackTrace();
        }
    }
}
