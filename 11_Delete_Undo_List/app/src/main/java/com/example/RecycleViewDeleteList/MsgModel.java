package com.example.RecycleViewDeleteList;

public class MsgModel {
    private String letter;
    private int image;

    public MsgModel(String letter, int image) {
        this.letter = letter;
        this.image = image;
    }

    public String getName() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
