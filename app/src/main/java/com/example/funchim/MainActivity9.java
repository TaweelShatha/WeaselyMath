package com.example.funchim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {
    public Button reset;
    public Button exit;
    public Button next;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        MediaPlayer music = MediaPlayer.create(MainActivity9.this, R.raw.harrypotterthemesong);
        music.start();
        MediaPlayer musicq = MediaPlayer.create(MainActivity9.this, R.raw.quote);
        playAudioWithDelay(musicq);
        reset = findViewById(R.id.buttonreset);
        exit = findViewById(R.id.buttonexit);
        next = findViewById(R.id.buttonnext2);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity9.this, MainActivity.class));
                music.stop();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.stop();
                musicq.stop();
                startActivity(new Intent(MainActivity9.this, MainActivity10.class));

            }
        });


    }
    public void playAudioWithDelay(MediaPlayer m){
        Handler handler = new Handler();
        final  int DELAY = 2000;
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                m.start();

            }
        }, DELAY);
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                m.start();

            }
        }, DELAY * 3);
    }
}