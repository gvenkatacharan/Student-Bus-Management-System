package com.example.venka.studentbusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Scheduletracker extends AppCompatActivity {
    String value=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduletracker);
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference myRef=database.getReference("Bus");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value=dataSnapshot.getValue(String.class);
                String [] separated =value.split(",");
                String busno =separated[0].trim();
                String loc =separated[1].trim();
                String inout =separated[2].trim();
                TextView textView=(TextView) findViewById(R.id.busnumber);
                textView.setText(busno);
                TextView textView2=(TextView) findViewById(R.id.loc);
                TextView textView3=(TextView) findViewById(R.id.inorout);
                int dLat = Integer.parseInt(loc);
                int dLong= Integer.parseInt(inout);
                if(dLat==1)
                {
                    textView2.setText("Hostels");
                }
                else
                {
                    textView2.setText("College");
                }
                if(dLong==1)
                {
                    textView3.setText("started");
                }
                else {
                    textView3.setText("ended");
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });

        DatabaseReference myRef2=database.getReference("Time");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value=dataSnapshot.getValue(String.class);
                TextView textView=(TextView) findViewById(R.id.time1);
                TextView textView2=(TextView) findViewById(R.id.time2);
                textView.setText(value);
                textView2.setText(value);



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });

    }
}
