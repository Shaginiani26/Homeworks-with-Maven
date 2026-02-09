package Homework.February;

import java.util.ArrayList;
import java.util.List;

public class StudentSorter {

    List<Student> students = new ArrayList<>();

    public void sortByDescending(){
        students.sort((s1, s2) -> s2.getScore() - s1.getScore());
    }

    void printStudents() {  // separate method
        for (Student s : students) {
            System.out.println("TASK - 7: " + s.name + " : " + s.score);
        }
    }

    public void run() {
        students.add(new Student("Giorgi", 60));
        students.add(new Student("beka", 80));
        students.add(new Student("zura", 100));
        students.add(new Student("Luka", 70));
        sortByDescending();
        printStudents();
    }


}
