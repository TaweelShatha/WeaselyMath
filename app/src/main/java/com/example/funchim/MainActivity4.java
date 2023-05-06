package com.example.funchim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    public Button reset;
    public EditText answer;
    public Button checkanswer;
    public Button exit;
    public TextView tryagain;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        MediaPlayer music2 = MediaPlayer.create(MainActivity4.this, R.raw.continuo);
        music2.start();
        MediaPlayer music = MediaPlayer.create(MainActivity4.this, R.raw.harrypotterthemesong);
        music.start();
        setContentView(R.layout.activity_main4);
        reset = findViewById(R.id.buttonreset);
        answer = findViewById(R.id.editTextNumber);
        checkanswer = findViewById(R.id.buttoncheck);
        exit = findViewById(R.id.button2);
        tryagain = findViewById(R.id.textView);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity4.this, MainActivity.class));
                music.pause();

            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        checkanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(answer.getText().toString()) == 1) {
                    MediaPlayer music3 = MediaPlayer.create(MainActivity4.this, R.raw.welldone);
                    music3.start();
                    startActivity(new Intent(MainActivity4.this, MainActivity5.class));
                    music.pause();
                }
                else if(answer.getText().equals("") |Integer.parseInt(answer.getText().toString()) != 1 ){
                    MediaPlayer again = MediaPlayer.create(MainActivity4.this, R.raw.tryagain);
                    again.start();
                    tryagain.setText("\n Please try again Mr. weasely!");
                    tryagain.setText("\n Please try again Mr. weasely!");

                }
            }
        });

    }
}