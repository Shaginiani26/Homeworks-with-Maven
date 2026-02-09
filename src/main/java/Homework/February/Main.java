package Homework.February;

public class Main {

    public static void main(String[] args) {
        StudentSorter sorter = new StudentSorter();


        //This Method will provide week schedule of school subjects by inserting a relevant day from Mon to Fri
        SchoolSchedule.printScheduleForDay("Wednesday");

        //This method will provide random georgian full name.
        GeorgianNameGenerator.getRandomName();

        //This method will priunt students minimum maximum and average score of all of them combined.
        GradeStats.printStats();

        //Email checker for symbols @ and . / if there is no @ or more than 1 @ it will fail. If there is no . it will fail as well.
        EmailValidator.isValid("randomEmail@goodloop.test");

        //removes non Georgian letters.
        System.out.println(LettercheckerAndRemover.removeNonGeorgianChars("Dont remove me დავალება 5: - წაუშლადი, please"));


        //Prints names with first vowel letter
        TestDataFromFile.namePrinter();

        //Prints scores by descending
        sorter.run();
    }
}
