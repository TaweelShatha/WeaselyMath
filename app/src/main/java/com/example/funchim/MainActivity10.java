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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {
    public Button reset;
    public EditText answer;
    public Button checkanswer;
    public Button exit;
    public TextView tryagain;
    int score = 5;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        MediaPlayer music2 = MediaPlayer.create(MainActivity10.this, R.raw.mustbeaweasly);
        music2.start();
        MediaPlayer music = MediaPlayer.create(MainActivity10.this, R.raw.harrypotterthemesong);
        music.start();
        MediaPlayer musicr = MediaPlayer.create(MainActivity10.this, R.raw.followthespiders);
        playAudioWithDelay(musicr);
        reset = findViewById(R.id.buttonreset);
        answer = findViewById(R.id.editTextNumber);
        checkanswer = findViewById(R.id.buttoncheck);
        exit = findViewById(R.id.button2);
        tryagain = findViewById(R.id.textView);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity10.this, MainActivity.class));
                music.pause();
                music2.stop();
                musicr.stop();

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
                if (Integer.parseInt(answer.getText().toString()) == 8) {
                    MediaPlayer music3 = MediaPlayer.create(MainActivity10.this, R.raw.brilliant);
                    music3.start();
                    setContentView(R.layout.activity_main9);
                    musicr.stop();
                    TextView t = findViewById(R.id.textView5);
                    ImageView i = findViewById(R.id.imageView15);
                    Button next = findViewById(R.id.buttonnext2);
                    t.setText("Well weasely, wait unit my father hear about this!");
                    i.setImageResource(R.drawable.malfoy);
                    MediaPlayer draco = MediaPlayer.create(MainActivity10.this, R.raw.waittillmyfatherhearaboutthis);
                    playAudioWithDelay(draco);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            setContentView(R.layout.activity_main10);
                            EditText answer = findViewById(R.id.editTextNumber);
                            Button checkanswer = findViewById(R.id.buttoncheck);
                            TextView tryagain = findViewById(R.id.textView);
                            tryagain.setText("\nHow about now weasely?");
                            answer.setVisibility(View.INVISIBLE);
                            checkanswer.setVisibility(View.INVISIBLE);
                            ImageView i1 = findViewById(R.id.imageView7);
                            ImageView i2 = findViewById(R.id.imageView16);
                            ImageView i3 = findViewById(R.id.imageView4);
                            ImageView i4 = findViewById(R.id.imageView6);
                            ImageView i5 = findViewById(R.id.imageView13);
                            ImageView i6 = findViewById(R.id.imageView9);
                            ImageView i7 = findViewById(R.id.imageView14);
                            ImageView i8 = findViewById(R.id.imageView10);
                            ImageView plus = findViewById(R.id.imageView17);
                            ImageView d = findViewById(R.id.imageView11);
                            ImageView b = findViewById(R.id.imageView3);
                            i1.setVisibility(View.INVISIBLE);
                            i2.setVisibility(View.INVISIBLE);
                            i3.setVisibility(View.INVISIBLE);
                            i4.setVisibility(View.INVISIBLE);
                            i5.setVisibility(View.INVISIBLE);
                            i6.setVisibility(View.INVISIBLE);
                            i7.setVisibility(View.INVISIBLE);
                            i8.setVisibility(View.INVISIBLE);
                            plus.setVisibility(View.INVISIBLE);
                            TextView q = findViewById(R.id.questions);
                            EditText n2 = findViewById(R.id.editTextNumber2);
                            EditText n3 = findViewById(R.id.editTextNumber3);
                            EditText n4 = findViewById(R.id.editTextNumber4);
                            EditText n5 = findViewById(R.id.editTextNumber5);
                            EditText n6 = findViewById(R.id.editTextNumber6);
                            Button check = findViewById(R.id.check);
                            Button showscore = findViewById(R.id.score);
                            TextView textView = findViewById(R.id.textView6);
                            q.setVisibility(View.VISIBLE);
                            n2.setVisibility(View.VISIBLE);
                            n3.setVisibility(View.VISIBLE);
                            n4.setVisibility(View.VISIBLE);
                            n5.setVisibility(View.VISIBLE);
                            n6.setVisibility(View.VISIBLE);
                            check.setVisibility(View.VISIBLE);
                            check.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    d.setVisibility(View.INVISIBLE);
                                    tryagain.setVisibility(View.INVISIBLE);
                                    b.setVisibility(View.INVISIBLE);
                                    check.setVisibility(View.INVISIBLE);
                                    showscore.setVisibility(View.VISIBLE);
                                    if (Integer.parseInt(n2.getText().toString()) == 20) {
                                        n2.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n3.getText().toString()) == 9) {
                                        n3.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n4.getText().toString()) == 5) {
                                        n4.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n5.getText().toString()) == 11) {
                                        n5.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    if (Integer.parseInt(n6.getText().toString()) == 5) {
                                        n6.setBackgroundColor(getColor(R.color.green));
                                        score++;
                                    }
                                    showscore.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            q.setVisibility(View.INVISIBLE);
                                            n2.setVisibility(View.INVISIBLE);
                                            n3.setVisibility(View.INVISIBLE);
                                            n4.setVisibility(View.INVISIBLE);
                                            n5.setVisibility(View.INVISIBLE);
                                            n6.setVisibility(View.INVISIBLE);
                                            textView.setVisibility(View.VISIBLE);
                                            textView.setText("Thank you for helping Ron! \n your score is : " + score + "/10");

                                        }
                                    });

                                }
                            });

                        }
                    });

                } else if (answer.getText().equals("") | Integer.parseInt(answer.getText().toString()) != 8) {
                    tryagain.setText("\n not even close weasely!");

                }
            }
        });

    }

    public void playAudioWithDelay(MediaPlayer m) {
        Handler handler = new Handler();
        final int DELAY = 5000;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                m.start();

            }
        }, DELAY);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                m.start();

            }
        }, DELAY * 3);
    }
}