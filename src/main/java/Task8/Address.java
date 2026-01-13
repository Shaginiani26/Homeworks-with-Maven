package Task8;

import net.datafaker.Faker;

public class Address {


    String country;
    String city;
    String street;

    public Address(String country, String city, String street){
        this.country = country;
        this.city = city;
        this.street = street;
    }

    public String toString(){

        return country + ", " + city + ", " + street;
    }

}
