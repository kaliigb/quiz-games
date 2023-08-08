package com.example.whointhepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class players extends AppCompatActivity {
    String []name ={"ronaldo","benzema","kaka","lampard"};
    int [] img={R.drawable.cr7,R.drawable.benzema,R.drawable.kaka,R.drawable.lampard};
    ImageView cr7;
    int i;
    EditText oday;
    TextView text;
    String n;
    String str="";

    ImageView c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        text=findViewById(R.id.text);
        text.setText("who is the player");
        ImageView c=findViewById(R.id.cr7);
        c.setImageResource(img[0]);

    }
    public void pp(View view) {
        str="";
        EditText o =(EditText) findViewById(R.id.oday);
        n =o.getText().toString();
        for (int c=0;c<n.length();c++)
            if(n.charAt(c)!=' ')
                str+=n.charAt(c);

        if(i<name.length-1){
            if(str.toLowerCase().toString().equals(name[i])){
                ImageView c=findViewById(R.id.cr7);
                i++;
                c.setImageResource(img[i]);
                Toast.makeText(this, "sucsses", Toast.LENGTH_SHORT).show();

                o.setText("");
            }
            else
                Toast.makeText(this, "no sucsses", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent=new Intent(players.this,clubs.class);
            startActivity(intent);

        }
    }

}