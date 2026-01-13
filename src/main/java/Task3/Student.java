package Task3;

import net.datafaker.Faker;

public class Student {


    private String name;
    private int age;
    private int grade;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }



    public static void main(String[] args) {

        Faker faker = new Faker();
        Student student = new Student();

        student.setName(faker.name().name());
        student.setAge(faker.number().numberBetween(18, 60));
        student.setGrade(faker.number().numberBetween(25, 100));

        System.out.println("Student name is: " + student.name);
        System.out.println("Student age is: " +student.age);
        System.out.println("Student's grade is: " +student.grade);

    }
}


