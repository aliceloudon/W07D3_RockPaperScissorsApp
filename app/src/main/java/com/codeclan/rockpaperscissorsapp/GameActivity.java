package com.codeclan.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {


    Button rockButton;
    Button paperButton;
    Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);

    }

    public void setRockButtonClicked(View button){

        Log.d(getClass().toString(), "button was clicked");
        String input = "rock";
        Log.d("Input was: ", input);

        Intent intent = new Intent(this, RockPaperScissorsActivity.class);
        intent.putExtra("input", input);

        startActivity(intent);
    }

    public void setPaperButtonClicked(View button){

        Log.d(getClass().toString(), "button was clicked");
        String input = "paper";
        Log.d("Input was: ", input);

        Intent intent = new Intent(this, RockPaperScissorsActivity.class);
        intent.putExtra("input", input);

        startActivity(intent);
    }

    public void setScissorsButtonClicked(View button){

        Log.d(getClass().toString(), "button was clicked");
        String input = "scissors";
        Log.d("Input was: ", input);

        Intent intent = new Intent(this, RockPaperScissorsActivity.class);
        intent.putExtra("input", input);

        startActivity(intent);
    }

}
