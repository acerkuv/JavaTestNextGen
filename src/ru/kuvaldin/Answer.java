package ru.kuvaldin;

public class Answer {
    private String text;

    Answer (String text){
        this.text =text;
    }
    public void showText(boolean answer){
        if(answer) System.out.println(text +  "правильный");
        else System.out.println(text + "ошибчный");
    }
}
