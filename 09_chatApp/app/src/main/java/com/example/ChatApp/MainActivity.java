package com.example.ChatApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        actionBar.setTitle("Lets Chat");
    }

    public void PersonOne(View v){
        Intent intent= new Intent(this, PersonTwo.class);
        startActivity(intent);

    }
    public void PersonTwo(View v){
        Intent intent= new Intent(this, PersonOne.class);
        startActivity(intent);

    }
}