package com.example.multiple_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity3 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE3 = "com.example.multiple_activity.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);


        Intent intent= getIntent();
        String message= intent.getStringExtra(activity2.EXTRA_MESSAGE2);

        EditText editText= findViewById(R.id.ed3);
        editText.setText(message);
    }

    public void sendMessage3(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = findViewById(R.id.ed3);
        String message3 = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);
        startActivity(intent);
    }
}