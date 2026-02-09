package Homework.February;

public class EmailValidator {

    public static void isValid(String email){

        int atSign = 0;
        for (int i = 0; i < email.length(); i++){
            if(email.charAt(i) == '@'){
                atSign ++;
            }
            if(atSign > 1)
                break;
        }

        if(atSign != 1) {
            System.out.println("TASK - 4: Email address is invalid - Must have exactly one @");
            return;
        }

        int positionOfAtSign = email.indexOf('@');
        boolean hasDotAfterSign = false;

        for(int i = positionOfAtSign + 1; i < email.length(); i ++){

            if(email.charAt(i) == '.'){
                hasDotAfterSign = true;
                break;
                }
            }
        if(!hasDotAfterSign){
            System.out.println("TASK - 4: Email Should have at least one \".\" after \"@\"");
            } else {
            System.out.println("TASK - 4: Email is fine, good job.");
            }
        }
    }
