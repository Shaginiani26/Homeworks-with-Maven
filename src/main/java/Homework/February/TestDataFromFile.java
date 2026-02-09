package Homework.February;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestDataFromFile {

    public static void namePrinter() {

        char[] vowelLetters = {'ა', 'ე', 'ი', 'ო', 'უ'};

        String filePath = "C:\\Users\\Shagi\\Desktop\\test.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while((line = reader.readLine()) != null) {

                char firstChar = line.charAt(0);

                boolean isLetterVowel = false;

                for(char vowel : vowelLetters){
                    if(firstChar == vowel) {
                        isLetterVowel = true;
                        break;
                    }
                }

                if(isLetterVowel) {
                    System.out.println("TASK - 6: " + line);

                }

            }



        } catch (FileNotFoundException e) {
            System.out.println("no file.");
        } catch (IOException e) {
            System.out.println("wrong");
        }

    }

}
