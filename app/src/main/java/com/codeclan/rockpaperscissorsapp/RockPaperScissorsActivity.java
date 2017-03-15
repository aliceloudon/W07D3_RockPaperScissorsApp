package com.codeclan.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RockPaperScissorsActivity extends AppCompatActivity {

    TextView userAnswerText;
    TextView computerAnswerText;
    RockPaperScissors rockPaperScissors;
    TextView resultText;
    //logic

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String input = extras.getString("input");

        userAnswerText = (TextView) findViewById(R.id.user_answer_text);
        userAnswerText.setText("You played " + input);

        rockPaperScissors = new RockPaperScissors();
        computerAnswerText = (TextView)findViewById(R.id.computer_answer_text);
        String computerInput = rockPaperScissors.getAnswer();
        computerAnswerText.setText("App played " + computerInput);

        resultText = (TextView)findViewById(R.id.result_text);
        resultText.setText(rockPaperScissors.whoWon(input, computerInput));

    }

}
