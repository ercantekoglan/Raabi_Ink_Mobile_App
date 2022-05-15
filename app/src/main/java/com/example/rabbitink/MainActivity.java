package com.example.rabbitink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnInfo = (Button) findViewById(R.id.btnBanner);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main_banner.class));

            }//end OnClick
        }); // end btnInfo


        Button btnEbmroidery = (Button) findViewById(R.id.btnEmbroidery);
        btnEbmroidery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Embroidery_Main.class));

            }//end OnClick
        }); // end btnInfo
        Button btnShirts = (Button) findViewById(R.id.btnShirts);
        btnShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main_tshirtcap.class));

            }//end OnClick
        }); // end btnInfo

        Button btnContact = (Button) findViewById(R.id.btnContact);
        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, contact_form.class));

            }//end OnClick
        }); // end btnInfo
    }
}