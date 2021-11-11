package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class learning_activity extends AppCompatActivity {
    Button halqiyah_btn;
    Button lahatiyah_btn;
    Button shajariyah_btn;
    Button tarfiyah_btn;
    Button niteeyah_btn;
    Button lasaviyah_btn;
    Button ghunna_btn;
    ImageView learn_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        getComponents();
    }

    void getComponents(){
        halqiyah_btn=(Button) findViewById(R.id.halqiyah);
        lahatiyah_btn=(Button) findViewById(R.id.lahatiyah);
        shajariyah_btn=(Button) findViewById(R.id.shajariah);
        tarfiyah_btn=(Button) findViewById(R.id.tarfiyah);
        niteeyah_btn=(Button) findViewById(R.id.niteeyah);
        lasaviyah_btn=(Button) findViewById(R.id.lasaviyah);
        ghunna_btn=(Button) findViewById(R.id.ghunna);
        learn_img=(ImageView) findViewById(R.id.learn_img);
    }

    void clickFunctions(){
        halqiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.halqiyah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
        lahatiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.lahatiyah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
        shajariyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.shajariyah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
        tarfiyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.tarfiyah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
        niteeyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.neetiyah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
        lasaviyah_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.lisaveyah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
        ghunna_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn_img.setImageResource(R.drawable.ghunnah);
                Intent intent=new Intent(learning_activity.this, learn_huruf.class);
                startActivity(intent);
            }
        });
    }
}