package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_activity extends AppCompatActivity {
    Button opt1, opt2, opt3, opt4, next_btn;
    TextView ques, score_val;
    int i = 0, score=0;
    String question[] = {"quest1", "quest2"};
    String options[][] = {{"A", "B", "C", "D"}, {"A", "B", "C", "D"}};
    char selected[]={0};
    char answer[] = {'C', 'B'};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        myview(i);
    }

    void loadUI() {


        opt1 = (Button) findViewById(R.id.opt1);
        opt2 = (Button) findViewById(R.id.opt2);
        opt3 = (Button) findViewById(R.id.opt3);
        opt4 = (Button) findViewById(R.id.opt4);
        next_btn = (Button) findViewById(R.id.next_btn);
        ques = (TextView) findViewById(R.id.question);
        score_val=(TextView) findViewById(R.id.val);
    }

    void clickFunc() {
        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
                selected[i]='A';
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
                selected[i]='B';
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
                selected[i]='C';
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.parseColor("#FF0000"));
                selected[i]='D';
            }
        });

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myview(i);
            }
        });
    }

    public void myview(int i) {
        if(selected[i]==answer[i]){
            score++;
            score_val.setText(String.valueOf(score));
        }
        i++;
        if (question[i] != null) {
            ques.setText(question[i]);
            opt1.setText(options[i][0]);
            opt2.setText(options[i][1]);
            opt3.setText(options[i][2]);
            opt4.setText(options[i][3]);
        }
    }
}