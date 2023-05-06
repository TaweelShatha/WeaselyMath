package com.example.funchim;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    public Button reset;
    public Button exit;
    public Button next;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        MediaPlayer music = MediaPlayer.create(MainActivity3.this, R.raw.harrypotterthemesong);
        music.start();
        MediaPlayer music4 = MediaPlayer.create(MainActivity3.this, R.raw.helpwillalwaysbegiven);
        playAudioWithDelay(music4);
        setContentView(R.layout.activity_main3);
        reset = findViewById(R.id.buttonreset);
        exit = findViewById(R.id.buttonexit);
        next = findViewById(R.id.buttonnext);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
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
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music4.stop();
                music.stop();
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));

            }
        });
    }
    public void playAudioWithDelay(MediaPlayer m){
        Handler handler = new Handler();
        final  int DELAY = 1000;
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