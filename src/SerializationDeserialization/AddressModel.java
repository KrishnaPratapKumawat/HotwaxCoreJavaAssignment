package SerializationDeserialization;

import java.io.*;
import java.lang.*;

public class AddressModel implements Serializable {

        public String getCity ()
        {
            return city;
        }

        public String getState ()

        {
            return state;
        }

        public Integer getPinCode ()
        {
            return pinCode;
        }

        public String getCountry ()
        {
            return country;
        }
        public void setCountry (String country)
        {
            this.country = country;
        }

        private String city;
        private String state;
        private Integer pinCode;
        private String country;

    public AddressModel(String city, String state, Integer pinCode, String country) {

        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;

    }

}


