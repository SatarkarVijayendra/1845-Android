package com.example.ChatApp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.io.Serializable;
import java.util.ArrayList;

public class PersonTwo extends AppCompatActivity implements Serializable {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager layoutManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persontwo);

       final ArrayList<MsgModel2> texts= MsgHolder2.getInstance().chats;
       final ArrayList<MsgModel1> PersonTwo= MsgHolder1.getInstance().chats;


        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        LayoutInflater mInflater=LayoutInflater.from(this);

        View mCustomView= mInflater.inflate(R.layout.actionbar1,null);
        actionBar.setCustomView(mCustomView);
        actionBar.setDisplayShowCustomEnabled(true);


        recyclerView= (RecyclerView) findViewById(R.id.p_two_recycle);

        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        final  MaterialButton sendButton= (MaterialButton) findViewById(R.id.p_two_send);
        final TextInputEditText message= (TextInputEditText) findViewById(R.id.p_two_message);



        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String messagetxt = message.getText().toString();
                if (messagetxt.matches("")){
                    return;
                }
                else {


                    texts.add(new MsgModel2(PersonOneAdapter.MESSAGE_TYPE_IN, messagetxt));
                    PersonTwo.add(new MsgModel1(PersonTwoAdapter.MESSAGE_TYPE_OUT, messagetxt));
                    message.setText("");
                    message.clearFocus();
                    myAdapter = new PersonTwoAdapter(PersonTwo);
                    recyclerView.setAdapter(myAdapter);
                }

            }
        });
        myAdapter = new PersonTwoAdapter(PersonTwo);
        recyclerView.setAdapter(myAdapter);



    }
}