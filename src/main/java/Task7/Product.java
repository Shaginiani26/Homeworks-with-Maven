package Task7;

import net.datafaker.Faker;

public class Product {



    public double discount(double price, int discount){
        return price - (price * discount / 100);
    }



    public static void main(String[] args) {

        Faker faker = new Faker();
        Product product = new Product();

        double price = faker.number().numberBetween(49.99, 250.99);
        int discount = faker.number().numberBetween(10, 50);

        double priceAfterDiscount = product.discount(price, discount);
        double roundOff = Math.round(priceAfterDiscount * 100.0) / 100.0;

        System.out.println(roundOff);
    }


}
