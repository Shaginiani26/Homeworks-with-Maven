package Homework.February;

public class LettercheckerAndRemover {

    public static String removeNonGeorgianChars(String input) {

        char[] georgianLetters = {'ა', 'ბ', 'გ', 'დ', 'ე', 'ვ', 'ზ', 'თ', 'ი', 'კ', 'ლ', 'მ', 'ნ', 'ო', 'პ', 'ჟ', 'რ', 'ს', 'ტ', 'უ', 'ფ', 'ქ', 'ღ', 'ყ', 'შ', 'ჩ', 'ც', 'ძ', 'წ', 'ჭ', 'ხ', 'ჯ', 'ჰ'};

        String onlyGeorgianLetters = "";

        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);
            boolean isGeorgian = false;

        for (char georgian:georgianLetters){
            if (current == georgian){
                isGeorgian = true;
                break;
                }
            }

        if(isGeorgian || Character.isDigit(current) || Character.isWhitespace(current) || current == '.' || current == ',' || current == '-'){
            onlyGeorgianLetters += current;
            }

        }

        return onlyGeorgianLetters;

    }



}



