package Homework.February;

import java.util.ArrayList;
import java.util.Random;

public class GeorgianNameGenerator {

    public static void getRandomName(){

        ArrayList<String> georgianNames = new ArrayList<>();

        georgianNames.add("Giorgi Mevenaxe");
        georgianNames.add("Beka Ludoshvili");
        georgianNames.add("Zura Tamashadze");
        georgianNames.add("Lado Durglishvili");
        georgianNames.add("KOKO Lomidze");
        georgianNames.add("Elene Arayisshvili");
        georgianNames.add("Mariam Pamidorishvili");
        georgianNames.add("Zuka Kitridze");
        georgianNames.add("Ika Xorblia");
        georgianNames.add("Akaki Saxamebladze");
        georgianNames.add("Vladimer Pqvilidze");
        georgianNames.add("Archil Eshmakia");



        //new Random().nextInt will provide a random index number which will be capped to the size of the random name array so you dont have to put non-random index while calling for this method
        System.out.println("TASK - 2: " +georgianNames.get(new Random().nextInt(georgianNames.size())));

    }



}
