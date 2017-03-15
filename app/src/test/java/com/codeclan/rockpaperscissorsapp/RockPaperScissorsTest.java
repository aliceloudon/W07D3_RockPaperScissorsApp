package com.codeclan.rockpaperscissorsapp;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by user on 15/03/2017.
 */

public class RockPaperScissorsTest {

    ArrayList<String> testAnswers;

    @Test
    public void getAnswersTest(){
        RockPaperScissors answers = new RockPaperScissors();
        assertNotNull(answers.getAnswer());
    }

    @Test
    public void getLengthTest(){
        RockPaperScissors answers = new RockPaperScissors();
        assertEquals(3, answers.getLength());

    }

//    @Test
//    public void getRandomAnswer(){
//        RockPaperScissors answers = new RockPaperScissors();
//        assertEquals("Paper", answers.getAnswer());
//    }



}
