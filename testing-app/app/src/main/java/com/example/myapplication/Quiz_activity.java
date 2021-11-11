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
    String question[] = {"1. To pronounce halqiyah huruf, sound produced from:",
            "2. To pronounce lahatiyah huruf, sound produced from:",
            "3. To pronounce neetiyah huruf, sound produced from:",
            "4. To pronounce lisaveyah huruf, sound produced from:",
            "5. To pronounce tarfiyah huruf, sound produced from:"};
    String options[][] = {{"A) End of throat", "B) Middle of throat", "C) Start of throat", "D) All of these"},
                          {"A) Base of tongue near Uvula", "B) Portion of tongue near its base", "C) both a and b", "D) none of these"},
                          {"A) Tip of the tongue","B) Middle of tongue","C) Base of the tongue","D) None of these"},
                          {"A) Tip of the tongue touching the tip of the frontal 2 teeth","B) Tip of the tongue comes between the front top and bottom teeth","C) Both a and b","D) none of these"},
                          {"A) Rounded tip of the tongue touching the base of the frontal 8 teeth","B) Rounded tip of the tongue touching the base of the frontal 6 teeth","C) Rounded tip of the tongue touching the base of the frontal 4 teeth","D) All of these"}};

    char selected[]={0,0,0,0,0};
    char answer[] = {'D', 'C','A','C', 'D'};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        loadUI();
        clickFunc();
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