package com.example.myapplication;

public class Quiz {
    public String question;
    public String[] options;
    public int correct;
    public Quiz(){
        question=null;
        options= new String[3];
        correct=0;
    }
}
