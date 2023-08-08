package com.example.whointhepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class clubs extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    String []name ={"realmadrid","barcelona","liverpool","arsenal"};
    int [] img={R.drawable.rma,R.drawable.barcelona,R.drawable.liverpool,R.drawable.arsenal};
    ImageView cr7;
    int i;
    EditText oday;
    TextView text;
    String n,str;
    ImageView c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);
        text=findViewById(R.id.text);
        text.setText("who is the club");
        ImageView c=findViewById(R.id.cr7);
        c.setImageResource(img[0]);
        radioGroup=findViewById(R.id.radio);
        textView=findViewById(R.id.text5);


    }
    public void pp(View view) {

//        str="";
//        EditText o =(EditText) findViewById(R.id.oday);
//        n =o.getText().toString();
//        for (int c=0;c<n.length();c++)
//            if(n.charAt(c)!=' ')
//                str+=n.charAt(c);
//
//        if(i<name.length-1){
//            if(str.toLowerCase().toString().equals(name[i])){
//                ImageView c=findViewById(R.id.cr7);
//                i++;
//                c.setImageResource(img[i]);
//                Toast.makeText(this, "sucsses", Toast.LENGTH_SHORT).show();
//
//                o.setText("");
//            }
//            else
//                Toast.makeText(this, "no sucsses", Toast.LENGTH_SHORT).show();
//        }
//        else
//        {
//            Intent intent=new Intent(clubs.this,team.class);
//            startActivity(intent);
//
//        }
    }

    public void aa(View view) {
    }

    public void bb(View view) {
    }

    public void cc(View view) {
    }

    public void dd(View view) {
    }
}