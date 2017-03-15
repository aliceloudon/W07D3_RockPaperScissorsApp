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
                "Rock", "Paper", "Scissors"
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




}
