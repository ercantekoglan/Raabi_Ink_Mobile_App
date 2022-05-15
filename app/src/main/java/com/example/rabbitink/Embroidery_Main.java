package com.example.rabbitink;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Embroidery_Main extends AppCompatActivity {
    private VideoView _videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embroidery__main);
        _videoView = findViewById(R.id.videoView);

        Button btnRegular = (Button) findViewById(R.id.btnRegularEmbroidery);
        btnRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Embroidery_Main.this, Embroidery_Regular_Design.class));

            }//end OnClick
        }); // end btnInfo

        Button btnCustom = (Button) findViewById(R.id.btnCustomDesign);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Embroidery_Main.this, customdesign.class));

            }//end OnClick
        }); // end btnInfo

        Button btnEtsy = (Button) findViewById(R.id.btnEtsy);
        btnEtsy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.etsy.com/shop/TheRabbitINK?ref=shop_sugg";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button btnWatch = (Button) findViewById(R.id.btnWatch);
        btnWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _videoView.start();
                btnWatch.setVisibility(View.INVISIBLE);
            }
        });


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.emroidery;
        Uri uri = Uri.parse(videoPath);
        _videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        _videoView.setMediaController(mediaController);
        mediaController.setAnchorView(_videoView);



    }



}




