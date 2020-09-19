package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button sub;
    private Button div;
    private Button mul;
    private Button clear;
    private Button decimal;
    private Button equal;
    private TextView preresult;
    private TextView result;
    private TextView answer;
    private final char ADDITION = '+';
    private final char SUBTRACTION= '-';
    private final char DIVISION= '/';
    private final char MULTIPLICATION= '*';
    private final char EQUAL= '=';
    private double val1= Double.NaN;
    private double val2;
    private char ACTION;
    private boolean dec;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        preresult.setText("0");

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    //info.setText(null);
                    Toast toast = Toast.makeText(getApplicationContext(),"Invalid Num!",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else{
                    preresult.setText(preresult.getText().toString() + "0");
                }
                

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "1");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "1");
                }


            }

        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "2");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "2");
                }



            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "3");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "3");
                }



            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "4");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "4");
                }


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "5");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "5");
                }


            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "6");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "6");
                }


            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "7");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "7");
                }


            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "8");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "8");
                }


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText()=="0") {
                    preresult.setText(null);
                    preresult.setText(preresult.getText().toString() + "9");
                }
                else{
                    preresult.setText(preresult.getText().toString() + "9");
                }

            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(dec) {

                        Toast toast = Toast.makeText(getApplicationContext(),"Invalid Num!",Toast.LENGTH_SHORT);
                        toast.show();

                    }
                    else{
                    preresult.setText(preresult.getText().toString() + ".");
                        dec=true;
                    }
                    }


        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(preresult.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Num",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    compute();
                    ACTION = ADDITION;
                    result.setText(String.valueOf(val1) + "+");
                    preresult.setText("0");
                }
                dec=false;

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(preresult.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Num",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    compute();
                    ACTION = SUBTRACTION;
                    result.setText(String.valueOf(val1) + "-");
                    preresult.setText("0");
                }
                dec=false;


            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Num",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    compute();
                    ACTION = MULTIPLICATION;
                    result.setText(String.valueOf(val1) + "*");
                    preresult.setText("0");
                }
                dec=false;

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(preresult.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Num",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    compute();
                    ACTION = DIVISION;
                    result.setText(String.valueOf(val1) + "/");
                    preresult.setText("0");
                }
                dec=false;


            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(preresult.getText().toString().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(),"Enter Num",Toast.LENGTH_SHORT);
                    toast.show();
                }

                else if(preresult.getText()=="0"){

                    Toast toast = Toast.makeText(getApplicationContext(),"Invalid Num!",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    compute();
                    ACTION = EQUAL;
                    answer.setText(result.getText().toString() + String.valueOf(val2));
                    preresult.setText("0");
                    result.setText(String.valueOf(val1));
                }
                dec=false;

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(preresult.getText().length()>0){
                    CharSequence name= preresult.getText().toString();
                    preresult.setText(name.subSequence(0,name.length()-1));

                }
                else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    preresult.setText("0");
                    result.setText(null);
                    answer.setText(null);

                }
                dec=false;

            }
        });
    }

    private void setupViews(){
        one= (Button)findViewById(R.id.btn1);
        two= (Button)findViewById(R.id.btn2);
        three= (Button)findViewById(R.id.btn3);
        four= (Button)findViewById(R.id.btn4);
        five= (Button)findViewById(R.id.btn5);
        six= (Button)findViewById(R.id.btn6);
        seven= (Button)findViewById(R.id.btn7);
        eight= (Button)findViewById(R.id.btn8);
        nine= (Button)findViewById(R.id.btn9);
        zero= (Button)findViewById(R.id.btn0);
        add= (Button)findViewById(R.id.btnadd);
        sub= (Button)findViewById(R.id.btnsub);
        mul= (Button)findViewById(R.id.btnmul);
        div= (Button)findViewById(R.id.btndiv);
        equal=(Button)findViewById((R.id.btnequal));
        clear=(Button)findViewById(R.id.btnclear);
        decimal=(Button)findViewById(R.id.btndec);
        preresult=(TextView)findViewById(R.id.txtinput);
        result=(TextView)findViewById(R.id.txtoutput);
        answer=(TextView)findViewById(R.id.txtresult);


    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(preresult.getText().toString());

            switch(ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQUAL:
                    break;
                }
            }
        else{
            val1 = Double.parseDouble(preresult.getText().toString());
        }

    }
}