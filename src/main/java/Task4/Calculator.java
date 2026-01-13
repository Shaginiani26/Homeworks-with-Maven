package Task4;

import net.datafaker.Faker;

public class Calculator {


    public static  int multiply (int x, int y){

        return x * y;
    }

    public static  int multiply (int x, int y, int z){

        return x * y * z;
    }

    public static void main(String[] args) {

        Faker faker = new Faker();

        int sumTwo = multiply(faker.number().numberBetween(1,100), faker.number().numberBetween(1, 100));
        int sumOne = multiply(faker.number().numberBetween(1,100), faker.number().numberBetween(1, 100), faker.number().numberBetween(1, 100));


        System.out.println(sumOne);
        System.out.println(sumTwo);

    }
}
