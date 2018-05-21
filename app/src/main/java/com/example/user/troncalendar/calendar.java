package com.example.user.troncalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class calendar extends AppCompatActivity {
    static Intent intent = new Intent();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        ImageView imageView = findViewById(R.id.imageView6);
        ImageView imageView2 = findViewById(R.id.imageView8);
        ImageView imageView3 = findViewById(R.id.imageView9);
        TextView textView4 = findViewById(R.id.textView4);
        ImageView imageView1 = findViewById(R.id.imageView15);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage2();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage3();
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNextPage4();
            }
        });
        String title = "行事曆";
        textView4.setText(title);
    }

    private void startNextPage(){
        intent.setClass(this , course.class);
        startActivity(intent);
    }

    private void startNextPage2(){
        intent.setClass(this , activity.class);
        startActivity(intent);
    }

    private void startNextPage3(){
        intent.setClass(this , profile.class);
        startActivity(intent);
    }

    private void startNextPage4(){
        intent.setClass(this , addevent.class);
        startActivity(intent);
    }
}

