package com.example.myeventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BucharestCinema extends AppCompatActivity {

    private String[][]          mDataSource;
    private LinearLayoutManager mLinearLayoutManager;
    private RecyclerView        mRecyclerView;
    private mDemoAdapter        adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucharest_cinema);

        mDataSource = new String[][]{
                {"Mulan 3D", "Cinemax ", "Ora 16h", "04 feb"},
                {"Galeria inimilor frante", "Happy Cinema ", "Ora 19h30", "05 feb"},
                {"Clubul tinerelor Vrajitoare", "Happy Cinema ", "Ora 19h", "06 feb"},
                {"Honest thief", "Happy Cinema ", "Ora 20h", "06 feb"},
                {"Dama de cupa", "Happy Cinema ", "Ora 19h30", "07 feb"},
                {"Un tataie de cosmar", "Happy Cinema ", "Ora 20h", "07 feb"},
                {"Frozen 2", "Cinemax ", "Ora 20h", "08 mar"},
                {"Doamna si vagabondul", "Happy Cinema ", "Ora 16h", "17 mar"},
                {"Fast an furious 8", "Happy Cinema ", "Ora 18h", "26 mar"},
                {"James Bond", "Cinemax ", "Ora 16h", "04 apr"},
                {"Star Wars 10", "Happy Cinema ", "Ora 19h30", "05 apr"},
                {"Mulan 3D", "Happy Cinema ", "Ora 19h", "06 apr"},
                {"Baby Driver", "Happy Cinema ", "Ora 20h", "06 apr"},
                {"Frozen 2", "Happy Cinema ", "Ora 19h30", "07 apr"},
                {"Doamna si vagabondul", "Happy Cinema ", "Ora 20h", "07 apr"},
                {"Star Wars 9", "Cinemax ", "Ora 20h", "08 mai"},
                {"Avatar 2", "Happy Cinema ", "Ora 16h", "17 mai"},
                {"Avatar 2", "Happy Cinema ", "Ora 18h", "26 mai"},

        };


        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.eventBucharestRecycler);
        adapter = new mDemoAdapter(this, mDataSource);

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(adapter); //legam adapter de RecyclerView
        // !!!! cand se face set incepe sa incarce datele

    }
}