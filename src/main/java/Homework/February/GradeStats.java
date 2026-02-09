package Homework.February;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GradeStats {

    public static void printStats() {


        Map<String, Integer> studentsAndTheirScore = new HashMap<>();

        studentsAndTheirScore.put("Giorgi", 75);
        studentsAndTheirScore.put("zura", 80);
        studentsAndTheirScore.put("Lado", 85);
        studentsAndTheirScore.put("Koba", 90);
        studentsAndTheirScore.put("Anzori", 95);
        studentsAndTheirScore.put("Beka", 100);

        Collection<Integer> scores = studentsAndTheirScore.values();

        int minScore = Collections.min(scores);
        int maxScore = Collections.max(scores);

        for (String name : studentsAndTheirScore.keySet()) {
            if (studentsAndTheirScore.get(name) == minScore) {
                System.out.println("TASK - 3: Minimum score is - " + minScore + " Which belongs to : " + name);
            }
            if (studentsAndTheirScore.get(name) == maxScore) {
                System.out.println("TASK - 3: Maximum score is - " + maxScore + " Which belongs to : " + name);
            }
        }

        int sum = 0;
        for (int score : scores){
            sum += score;
        }


        System.out.println("TASK - 3: Average score is - " + (double) sum / scores.size());
    }
}
