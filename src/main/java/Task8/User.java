package Task8;

import net.datafaker.Faker;

public class User {

    String name;
    String secondName;
    Address address;

    public User (String name, String secondName, Address address){
        this.name = name;
        this.secondName = secondName;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", " + secondName + ", " + address;
    }

    public static void main(String[] args) {

        Faker faker = new Faker();

        Address address = new Address(
                faker.address().country(),
                faker.address().city(),
                faker.address().streetAddress()
        );

        User user = new User(
                faker.name().firstName(),
                faker.name().lastName(),
                address
        );

        System.out.println(user);

    }
}
