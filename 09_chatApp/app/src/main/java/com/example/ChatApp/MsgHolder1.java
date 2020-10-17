package com.example.ChatApp;

import java.util.ArrayList;

public class MsgHolder1 {
    final ArrayList<MsgModel1> chats= new ArrayList<>();

    private MsgHolder1(){}

    static MsgHolder1 getInstance(){
        if( instance == null ){
            instance = new MsgHolder1();

        }
        return instance;
    }
    private static MsgHolder1 instance;
}
