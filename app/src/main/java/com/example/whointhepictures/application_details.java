package com.example.whointhepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class application_details extends AppCompatActivity {
TextView nameApp;
TextView version;
ImageView iconapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_details);
        nameApp=findViewById(R.id.nameApp);
        nameApp.setText("Who in the picture");
        iconapp=findViewById(R.id.iconapp);
        iconapp.setImageResource(R.drawable.icon);
        version=findViewById(R.id.version);
        version.setText("version 1.0");

    }

    public void send(View view) {
        Intent sendmail =new Intent(Intent.ACTION_SEND);
        sendmail.setData(Uri.parse("mailto"));
        sendmail.setType("message/rfc822");

        sendmail.putExtra(Intent.EXTRA_SUBJECT,"my app");
        sendmail.putExtra(Intent.EXTRA_TEXT,"thank you for");
        startActivity(Intent.createChooser(sendmail,"share"));
    }


    public void share2(View view) {
        String txshare="who in the pic";
        String link="https://play.google.com/store/apps/details?id=com.hamdysrour.whoisthefootballplayer";
        Intent share =new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT,txshare+"\n"+link);
        startActivity(Intent.createChooser(share,"my share"));
    }
}