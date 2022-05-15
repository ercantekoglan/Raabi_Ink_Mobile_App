package com.example.rabbitink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main_tshirtcap extends AppCompatActivity {

    AnimationDrawable capAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tshirtcap);

        ImageView imgFrame=(ImageView)findViewById(R.id.imgGolf);
        imgFrame.setBackgroundResource(R.drawable.animation);
        capAnimation=(AnimationDrawable)imgFrame.getBackground();

        Button button1 = (Button) findViewById(R.id.btnStart);
        Button button2 = (Button) findViewById(R.id.btnStop);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capAnimation.start( );
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                capAnimation.stop( );
            }
        });
    }
}