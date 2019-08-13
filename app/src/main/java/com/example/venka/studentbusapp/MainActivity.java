package com.example.venka.studentbusapp;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v4.media.RatingCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.contact);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, contact.class);
                startActivity(intent);
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.busdetails);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, busdetails.class);
                startActivity(intent);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.tracking);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tracking.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = (ImageView) findViewById(R.id.schedule);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, schedule.class);
                startActivity(intent);
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.request);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, request.class);
                startActivity(intent);
            }
        });
        ImageView imageView6 = (ImageView) findViewById(R.id.scheduletracker);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scheduletracker.class);
                startActivity(intent);
            }
        });


    }
}

