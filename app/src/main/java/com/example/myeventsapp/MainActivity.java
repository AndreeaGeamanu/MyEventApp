package com.example.myeventsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private Button OnlineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OnlineButton= findViewById(R.id.btt1);

        OnlineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, OnlineEvents.class);
                startActivity(intent);

            }

        });
    }

    public void showPopUp(View v)
    {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.pupup_city_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                //Toast.makeText(this, "Item 1 clicked",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, BucharestActivity.class);
                startActivity(i);
                return true;
            case R.id.item2:
                Intent ii = new Intent(MainActivity.this, BuzauActivity.class);
                startActivity(ii);
                return true;
            case R.id.item3:
                Intent iii = new Intent(MainActivity.this, ClujActivity.class);
                startActivity(iii);
                return true;
            default:
                return false;
        }

    }


}