package Homework.January.Task1;

import net.datafaker.Faker;

public class Car {

    String brand;
    String model;
    int year;

    public void car() {

        Faker faker = new Faker();

        brand = faker.vehicle().manufacturer();
        model = faker.vehicle().model();
        year = faker.number().numberBetween(1950, 2025);

    }

    public void printInfo() {

        car();
        System.out.println("This car was manufactured by: " + brand + " in " + year + " and the model of this car is " + model);

    }

    public static void main(String[] args) {

        Car car = new Car();
        car.printInfo();
    }

}