package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;                         // changing the value of the score check to see which statement is being printed
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver == true) {                      // could be written "if (gameOver)" as well
            int finaleScore = score + (levelCompleted * bonus);         // you can access variables created outside of the code block in the code block
            System.out.println("Your final score was " + finaleScore);
        }

//        int savedFinalScore = finalScore;        // finalScore cannot be resolved because the variable finalScore was
                                                   // created in the previous code block and as soon as the section of
                                                   // code has finished it will automatically delete any variables that
                                                   // it creates in that code block

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        //But make sure the first printout above still displays as well

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
