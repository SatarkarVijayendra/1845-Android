package com.example.ChatApp;

import java.util.ArrayList;

public class MsgHolder2 {
    final ArrayList<MsgModel2> chats= new ArrayList<>();

    private MsgHolder2(){}

    static MsgHolder2 getInstance(){
        if( instance == null ){
            instance = new MsgHolder2();

        }
        return instance;
    }
    private static MsgHolder2 instance;
}
