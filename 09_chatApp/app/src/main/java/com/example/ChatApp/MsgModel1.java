package com.example.ChatApp;

import java.io.Serializable;

public class MsgModel1 implements Serializable {
    int type;
    String text;
    public MsgModel1(int type, String text){
        this.type= type;
        this.text= text;
    }

}
