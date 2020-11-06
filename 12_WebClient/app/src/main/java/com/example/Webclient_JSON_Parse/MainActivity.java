package com.example.Webclient_JSON_Parse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    MaterialButton fetchbtn;
    public static MaterialTextView fetchdata;
    public static  MaterialTextView TotSalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchbtn= (MaterialButton) findViewById(R.id.fetchbtn);
        fetchdata = (MaterialTextView) findViewById(R.id.fetcheddata);
        TotSalary=(MaterialTextView) findViewById(R.id.Totsalary);
        SortParseData sortData = new SortParseData();
        sortData.execute();
        fetchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext()," Total Salary :  "+ SortParseData.totalsalary.toString(),Toast.LENGTH_LONG).show();

            }
        });

    }
}

