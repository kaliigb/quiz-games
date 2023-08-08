package com.example.whointhepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class managers extends AppCompatActivity {
    String []name ={"klopp","guardiola","zidan","morinho"};
    int [] img={R.drawable.klopp,R.drawable.guardiola,R.drawable.zen_alden_zidan,R.drawable.jose_morenho};
    ImageView cr7;
    int i;
    EditText oday;
    TextView text;
    String n;
    ImageView c;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managers);
        text=findViewById(R.id.text);
        text.setText("who is the manager");
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
            Intent intent=new Intent(managers.this,players.class);
            startActivity(intent);

        }
    }
}