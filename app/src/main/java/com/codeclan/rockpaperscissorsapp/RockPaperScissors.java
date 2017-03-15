package com.codeclan.rockpaperscissorsapp;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 15/03/2017.
 */

public class RockPaperScissors {

    private ArrayList<String> answers;

    public RockPaperScissors(){
        answers = new ArrayList<String>();
        setUpAnswers();
    }

    public void setUpAnswers(){
        String[] answersToAdd = {
                "rock", "paper", "scissors"
        };

        for( String answer : answersToAdd )
            answers.add(answer);
    }

    public int getLength(){
        return answers.size();
    }

    public String getAnswerAtIndex(int index){
        return answers.get(index);
    }

    public String getAnswer(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(index);
        return answer;
    }

    public String whoWon(String userInput, String computerInput){
            if (userInput.equals(computerInput))
                return "It's a draw!";
            else if ((userInput.equals("rock")) && (computerInput.equals("paper")))
                return "App wins!";
            else if ((userInput.equals("rock")) && (computerInput.equals("scissors")))
                return "You win!";
            else if ((userInput.equals("paper")) && (computerInput.equals("rock")))
                return "You win!";
            else if ((userInput.equals("paper")) && (computerInput.equals("scissors")))
                return "App wins!";
            else if ((userInput.equals("scissors")) && (computerInput.equals("paper")))
                return "You win!";
            else if ((userInput.equals("scissors")) && (computerInput.equals("rock")))
                return "App wins!";
            else return "You're an idiot";
    }

}
