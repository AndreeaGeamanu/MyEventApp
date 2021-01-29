package com.example.myeventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class OnlineEvents extends AppCompatActivity {

    private String[][]          mDataSource;
    private LinearLayoutManager mLinearLayoutManager;
    private RecyclerView        mRecyclerView;
    private mDemoAdapter        adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_events);

        mDataSource = new String[][]{
                {"Prezentare program Work and Travel ", "Student travel Romania ", "Ora 19h", "03 feb"},
                {"See the Northern Lights", "Delta College Planetarium", "Ora 21h30", "07 feb"},
                {"Virtual Tour Amsterdam", "Girl Travel Tour", "Ora 16h", "13 feb"},
                {"O scrisoare pierduta Live", "facebook Teatrul National", "Ora 20h", "16 feb"},
                {"Prezentare program Work and Travel ", "Student travel Romania ", "Ora 19h", "23 feb"},
                {"See the Northern Lights", "Delta College Planetarium", "Ora 21h30", "27 feb"},
                {"Virtual Tour Berlin", "Girl Travel Tour", "Ora 16h", "13 mar"},
                {"O scrisoare pierduta Live", "facebook Teatrul National", "Ora 20h", "16 mar"},
                {"Prezentare program Work and Travel ", "Student travel Romania ", "Ora 19h", "03 apr"},
                {"See the Northern Lights", "Delta College Planetarium", "Ora 21h30", "07 apr"},
                {"Virtual Tour Oslo", "Girl Travel Tour", "Ora 16h", "13 mai"},
                {"O scrisoare pierduta Live", "facebook Teatrul National", "Ora 20h", "16 mai"},
                {"Prezentare program Work and Travel ", "Student travel Romania ", "Ora 19h", "03 iun"},
                {"See the Northern Lights", "Delta College Planetarium", "Ora 21h30", "07 iun"},


        };


        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView = findViewById(R.id.eventBucharestRecycler);
        adapter = new mDemoAdapter(this, mDataSource);

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(adapter); //legam adapter de RecyclerView
        // !!!! cand se face set incepe sa incarce datele

    }
}