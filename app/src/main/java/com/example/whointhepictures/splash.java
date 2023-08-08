package com.example.whointhepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    ImageView logo;
    TextView loding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread =new Thread(){
            public void run(){
                try {
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    Intent intent=new Intent(splash.this,MainActivity.class);
                    startActivity(intent);

                    finish();
                }
            }
        };
        thread.start();


        logo=findViewById(R.id.logo);
        logo.setImageResource(R.drawable.icon);
        loding=findViewById(R.id.loding);
        loding.setText("loading...");

    }
}