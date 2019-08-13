package com.example.venka.studentbusapp;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class request extends AppCompatActivity {
    private TextView countertext,granted;
    private ImageButton minusbtn;
    private ImageButton plusbtn;
    //private ImageButton resetbtn;
    private int counter;
    FirebaseDatabase database;
    DatabaseReference myRef;
    String value=null;
    private int number;
    private View.OnClickListener clickListner = new View.OnClickListener()
    {
        public void onClick(View view)
        {
            switch (view.getId())
            {
                case R.id.minusbtn:
                    minusCounter();
                    break;
                case R.id.plusbtn:
                    plusCounter();
                    break;
                /*case R.id.resetbtn:
                    initCounter(0);
                    break;*/
            }
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        database=FirebaseDatabase.getInstance();
        DatabaseReference myRef2=database.getReference("Counter");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value=dataSnapshot.getValue(String.class);
                number = Integer.parseInt(value);
                counter=number;
                number=(number*100)/50;
                if(counter==0){
                    granted.setVisibility(View.VISIBLE);
                }
                TextView textView=(TextView) findViewById(R.id.counter);
                textView.setText(number+"%");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        granted= (TextView) findViewById(R.id.granted) ;
        countertext = (TextView) findViewById(R.id.counter) ;
        minusbtn = (ImageButton) findViewById(R.id.minusbtn);
        minusbtn.setOnClickListener(clickListner);
        plusbtn = (ImageButton) findViewById(R.id.plusbtn);
        plusbtn.setOnClickListener(clickListner);
        //resetbtn = (ImageButton) findViewById(R.id.resetbtn);
        //resetbtn.setOnClickListener(clickListner);

        initCounter(number);

        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plusCounter();
                database=FirebaseDatabase.getInstance();
                myRef = database.getReference("Counter");
                myRef.setValue(counter+"");

            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                minusCounter();
                database=FirebaseDatabase.getInstance();
                myRef = database.getReference("Counter");
                myRef.setValue(counter+"");

            }
        });
        /*resetbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                initCounter(0);
                counter=0;
                database=FirebaseDatabase.getInstance();
                myRef = database.getReference("Counter");
                myRef.setValue(counter+"");

            }

        });*/



    }

    private void initCounter(int x)
    {
        counter=x;

        int percentage=(counter*100)/50;
        if(percentage>=0)
        {
            countertext.setText(percentage+"%");}
    }
    private void minusCounter()
    {
        counter--;
        int percentage=(counter*100)/50;
        if(percentage>=0)
        {
        countertext.setText(percentage+"%");}
    }
    private void plusCounter()
    {
        counter++;

        int percentage=(counter*100)/50;
        if(percentage<=100)
        {
            countertext.setText(percentage+"%");}
    }

}
