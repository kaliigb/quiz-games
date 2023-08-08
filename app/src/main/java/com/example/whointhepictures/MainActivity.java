package com.example.whointhepictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String [] Levels ={"playres","clubs","team","managers"};
    int [] img ={R.drawable.players,R.drawable.clubs,R.drawable.national,R.drawable.managers};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.mylist);
        play play =new play();
        listView.setAdapter(new play());
    }

    public void Details(View view) {
        Intent intent=new Intent(MainActivity.this,application_details.class);
        startActivity(intent);
    }

    class  play extends BaseAdapter{

         @Override
         public int getCount() {
             return Levels.length;
         }

         @Override
         public Object getItem(int i) {
             return Levels[i];
         }

         @Override
         public long getItemId(int i) {
             return i;
         }

         @Override
         public View getView(int i, View view, ViewGroup viewGroup) {
             //convert xml element to view inorder to xml element
             //from java code
             LayoutInflater layoutInflater = getLayoutInflater();
             View my_row=layoutInflater.inflate(R.layout.my_row,null);
             TextView textView =my_row.findViewById(R.id.levelList);
             textView.setText(Levels[i]);
             ImageView imageView =my_row.findViewById(R.id.img1);
             imageView.setImageResource(img[i]);
             if (i == 0) {

                 my_row.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Intent intent=new Intent(MainActivity.this,players.class);
                         startActivity(intent);
                     }
                 });

             }
             if (i==1)
             {
                 my_row.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Intent intent=new Intent(MainActivity.this,clubs.class);
                         startActivity(intent);
                     }
                 });
             }
             if (i==2)
             {
                 my_row.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         Intent intent=new Intent(MainActivity.this,team.class);
                         startActivity(intent);
                     }
                 });
             }
             if (i==3)
             {
                 my_row.setOnClickListener(new View.OnClickListener()
                 {
                     @Override
                     public void onClick(View view) {
                         Intent intent=new Intent(MainActivity.this,managers.class);
                         startActivity(intent);
                     }
                 });
             }


             return my_row;

         }
     }
}