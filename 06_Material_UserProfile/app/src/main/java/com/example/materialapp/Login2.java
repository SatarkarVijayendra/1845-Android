package com.example.materialapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;


public class Login2 extends AppCompatActivity {

    private Button DatePicker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayShowTitleEnabled(false);
        TextInputEditText textInput= findViewById(R.id.goa);
        textInput.setFocusable(false);

        DatePicker= findViewById(R.id.btndate);
       final MaterialTextView dateview= (MaterialTextView) findViewById(R.id.txtbirth);

        Intent intent= getIntent();
        String personName= intent.getStringExtra(MainActivity.sendMessage);
        MaterialTextView nametext= findViewById(R.id.txtname);
        nametext.setText(personName);

        MaterialDatePicker.Builder builder= MaterialDatePicker.Builder.datePicker();

        final MaterialDatePicker materialDatePicker= builder.build();

        DatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                materialDatePicker.show(getSupportFragmentManager(),"Date_Picker");

            }
        });

        materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener() {
            @Override
            public void onPositiveButtonClick(Object selection) {
                dateview.setText(materialDatePicker.getHeaderText());

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

}