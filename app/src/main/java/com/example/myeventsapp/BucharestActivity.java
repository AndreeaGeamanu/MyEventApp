package com.example.myeventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BucharestActivity extends AppCompatActivity {

    private Button TheaterButton;
    private Button CinemaButton;
    private Button FestivalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucharest);


        TheaterButton= findViewById(R.id.btttheater);

        TheaterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(BucharestActivity.this, BucharestTheater.class);
                startActivity(intent);

            }

        });



        CinemaButton= findViewById(R.id.bttcinema);

        CinemaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BucharestActivity.this, BucharestCinema.class);
                startActivity(intent);

            }
        });



        FestivalButton = findViewById(R.id.bttfestival);

        FestivalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BucharestActivity.this, BucharestFestival.class);
                startActivity(intent);

            }


        });
    }
    }