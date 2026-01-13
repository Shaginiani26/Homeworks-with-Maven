package Task5;

import net.datafaker.Faker;

public class Book {

    Faker faker = new Faker();

    String title;
    String author;
    int pages;

    public void bookReview(){
        title = faker.book().title();
        author = faker.book().author();
        pages = faker.number().numberBetween(250,1000);

    }

    public String toString(){
        return "Book review: " + title + " By author " + author + " which has " + pages + " pages";
    }

    public static void main(String[] args) {

        Book book = new Book();
        book.bookReview();
        System.out.println(book);

    }
}
