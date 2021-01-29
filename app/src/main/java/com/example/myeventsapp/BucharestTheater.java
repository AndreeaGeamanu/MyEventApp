package com.example.myeventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BucharestTheater extends AppCompatActivity {

    private String[][]          mDataSource;
    private LinearLayoutManager mLinearLayoutManager;
    private RecyclerView        mRecyclerView;
    private mDemoAdapter        adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucharest_theater);



        mDataSource = new String[][]{
                {"Conu leonida fata cu reactiunea", "Teatrul de Comedie ", "Ora 16h", "04 feb"},
                {"Incognito", "Teatrul National ", "Ora 19h30", "05 feb"},
                {"Presul", "Teatrul National ", "Ora 19h", "06 feb"},
                {"20 de ani in Siberie", "Teatrul National ", "Ora 20h", "06 feb"},
                {"Anonimul Venetian", "Teatrul National ", "Ora 19h30", "07 feb"},
                {"Frumos e in septembrie la Venetia", "Teatrul National ", "Ora 20h", "07 feb"},
                {"Doi pe o banca", "Teatrul de Comedie ", "Ora 20h", "08 mar"},
                {"O scrisoare pierduta", "Teatrul National ", "Ora 16h", "17 mar"},
                {"Apocalipsa vine de pe Facebook", "Teatrul National ", "Ora 18h", "26 mar"},
                {"Conu leonida fata cu reactiunea", "Teatrul de Comedie ", "Ora 16h", "04 apr"},
                {"Incognito", "Teatrul National ", "Ora 19h30", "05 apr"},
                {"Presul", "Teatrul National ", "Ora 19h", "06 apr"},
                {"20 de ani in Siberie", "Teatrul National ", "Ora 20h", "06 apr"},
                {"Anonimul Venetian", "Teatrul National ", "Ora 19h30", "07 apr"},
                {"Frumos e in septembrie la Venetia", "Teatrul National ", "Ora 20h", "07 apr"},
                {"Doi pe o banca", "Teatrul de Comedie ", "Ora 20h", "08 mai"},
                {"O scrisoare pierduta", "Teatrul National ", "Ora 16h", "17 mai"},
                {"Apocalipsa vine de pe Facebook", "Teatrul National ", "Ora 18h", "26 mai"},

        };


        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.eventBucharestRecycler);
        adapter = new mDemoAdapter(this, mDataSource);

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(adapter); //legam adapter de RecyclerView
        // !!!! cand se face set incepe sa incarce datele

    }
}