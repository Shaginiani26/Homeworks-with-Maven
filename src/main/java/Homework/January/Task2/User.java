package Homework.January.Task2;

import net.datafaker.Faker;

public class User {

    Faker faker = new Faker();
    String name;
    String email;


    public User (){

        this.name = faker.name().name();
    }

    public User (String withEmail){

        this();
        email = faker.internet().emailAddress();
    }

    public static void main(String[] args) {

        User user = new User("withEmail");

        System.out.println(user.name);
        System.out.println(user.name + " " + user.email);

    }
}


