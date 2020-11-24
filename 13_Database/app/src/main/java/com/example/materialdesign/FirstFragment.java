package com.example.materialdesign;

import android.app.AlertDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.materialdesign.R;
import com.google.android.material.textfield.TextInputEditText;


public class FirstFragment extends Fragment {
    Button btnupload ,btnview;
    TextInputEditText test , email ,phone,password,re_password;

    SQLiteDatabase myDB;

    DBHelper db;

    public static final String sendMessage="com.example.materialapp";

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_first,container,false);

        TextInputEditText input;


        btnupload = (Button) view.findViewById(R.id.btnupload);
        btnview = (Button) view.findViewById(R.id.btnview);
        test= view.findViewById(R.id.txtname);
        email= view.findViewById(R.id.txtemail);
        phone= view.findViewById(R.id.txtphonenum);
        password= view.findViewById(R.id.txtpass);
        re_password= view.findViewById(R.id.txtrepass);

        db = new DBHelper(getContext());

        btnupload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = test.getText().toString();
                String mail= email.getText().toString();
                String no= phone.getText().toString();
                String pass=  password.getText().toString();
                String repass= re_password.getText().toString();

                Boolean checkinsertdata = db.insertinfo(name,mail,no,pass,repass);
                if(checkinsertdata==true){
                    Toast.makeText(getContext(),"inserted value", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getContext(),"Could no insert value", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = db.getdata();
                if(res.getCount()==0){
                    Toast.makeText(getContext(),"no Entry in Database",Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("User Name: "+res.getString(0)+"\n");
                    buffer.append("Email id: "+res.getString(1)+"\n");
                    buffer.append("Contact No: "+res.getString(2)+"\n");
                    buffer.append("password: "+res.getString(3)+"\n");
                    buffer.append("re-password: "+res.getString(4)+"\n\n");
                }
                AlertDialog.Builder builder= new AlertDialog.Builder(getContext());
                builder.setCancelable(true);
                builder.setTitle("User Data");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });

        input= (TextInputEditText) view.findViewById(R.id.txtname);
        return view;


    }

}