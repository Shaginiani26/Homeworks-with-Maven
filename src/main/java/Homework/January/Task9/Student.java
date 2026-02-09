package Homework.January.Task9;

import net.datafaker.Faker;

public class Student {

    Faker faker = new Faker();

    int studentID = faker.number().numberBetween(1, 100);

    public boolean equals(Object obj){
        if (obj instanceof Student){
            Student other = (Student) obj;
            return this.studentID == other.studentID;
        }
        return false;
    }

    public static void main(String[] args) {
        Student studentOne = new Student();
        Student studentTwo = new Student();

        System.out.println("ID one: " + studentOne.studentID);
        System.out.println("ID two: " + studentTwo.studentID);
        System.out.println("Comparison: equal or not - " + studentOne.equals(studentTwo));
    }

}
