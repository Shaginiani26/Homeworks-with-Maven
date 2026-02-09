package Homework.February;

import java.util.*;

public class SchoolSchedule {


    public static void printScheduleForDay(String day){


        Map<String, List<String>> schoolWeekDays = new LinkedHashMap<>();

        schoolWeekDays.put("Monday", Arrays.asList("Math", "Biology", "Geography"));
        schoolWeekDays.put("Tuesday", Arrays.asList("English", "Astrology", "Flora&Fauna"));
        schoolWeekDays.put("Wednesday", Arrays.asList("Mevenaxeoba", "Literature", "Cartography"));
        schoolWeekDays.put("Thursday", Arrays.asList("Archeology", "Chemistry", "PhisPrep"));
        schoolWeekDays.put("Friday", Arrays.asList("Art", "Music", "Rame skolis kidev erti sisulele"));

        List<String> schedule = schoolWeekDays.get(day);

        System.out.println("TASK - 1: " + day + ": " + schedule);
    }
}
