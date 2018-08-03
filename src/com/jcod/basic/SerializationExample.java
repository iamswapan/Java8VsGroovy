package com.jcod.basic;

import java.io.*;

class Address implements Serializable{
    public static final long serialVersionUID=1L;
    String street;
    Integer pin;
    String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", pin=" + pin +
                ", country='" + country + '\'' +
                '}';
    }
}

class WriteObject{
    public void makeDataSerial() {
        Address address = new Address();
        address.setStreet("Duragpur");
        address.setPin(713321);
        address.setCountry("India");

        try {
            FileOutputStream fos=new FileOutputStream("/home/ttnd/Study/address.scr");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(address);
            oos.close();
            System.out.println("serialization Done............");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

class ReadObject{
    public void makeDataDeserial(){
        try{
            FileInputStream fis=new FileInputStream("/home/ttnd/Study/address.scr");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Address address=(Address)ois.readObject();
            ois.close();
            System.out.println("Deserilization done..........");
            System.out.println("Read value=="+address);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

public class SerializationExample {
    public static void main(String[] args) {
       /* WriteObject write=new WriteObject();
        write.makeDataSerial();*/

        ReadObject read=new ReadObject();
        read.makeDataDeserial();
    }

}
