package SerializationDeserialization;

import java.io.*;
import java.util.*;

public class StudentModel implements Serializable {
    private String firstName;
    private Date d;
    private AddressModel add;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Date getD() {
        return d;
    }
    public AddressModel getAdd() {
        return add;
    }
    public void setDOB(Date d) {
        this.d = d;
    }
    public void setAddress(AddressModel add) {
        this.add = add;
    }
    public StudentModel(String firstName, Date d, AddressModel add) {
        this.firstName = firstName;
        this.d = d;
        this.add = add;
    }
    public StudentModel() {
    }
}
