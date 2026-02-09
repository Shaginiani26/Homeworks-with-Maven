package Homework.January.Task6;

import net.datafaker.Faker;

public class BankAccount {

    Faker faker = new Faker();


    int userBalance = faker.number().numberBetween(1, 200);

    public static void main(String[] args) {

        BankAccount balance = new BankAccount();

        if(balance.userBalance < 100 ){
            System.out.println("Your balance is less then needed. " + balance.userBalance);
        }
        else{
            System.out.println("Balance - GOOD");
        }
    }
}
