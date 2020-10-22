  package com.example.RecycleViewDeleteList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<MsgModel> letters;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Delete_Undo_List");
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        addletters();
        myAdapter=new MyAdapter(this,letters);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
    }

    private void addletters() {
        letters=new ArrayList<>();
        letters.add(new MsgModel(" Letter -  A",R.drawable.letter_a));
        letters.add(new MsgModel(" Letter -  B",R.drawable.b));
        letters.add(new MsgModel(" Letter -  C",R.drawable.c));
        letters.add(new MsgModel(" Letter -  D",R.drawable.d));
        letters.add(new MsgModel(" Letter -  E",R.drawable.e));
        letters.add(new MsgModel(" Letter -  F",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  G",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  H",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  I",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  J",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  K",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  L",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  M",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  N",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  O",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  P",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  Q",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  R",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  S",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  T",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  U",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  V",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  W",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  X",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  Y",R.drawable.letters));
        letters.add(new MsgModel(" Letter -  Z",R.drawable.letters));


    }

}