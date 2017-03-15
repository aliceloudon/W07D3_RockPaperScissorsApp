package com.codeclan.rockpaperscissorsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class RockPaperScissorsActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);

        rockButton = (Button) findViewById(R.id.rock_button);

    }
}
