package com.example.venka.studentbusapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class tracking extends AppCompatActivity {
    String value=null;
    String val=null;
    private int strength=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracking);

        ImageButton call1 = (ImageButton) findViewById(R.id.call1);
        call1.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7032236399"));
                if (ActivityCompat.checkSelfPermission(tracking.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(tracking.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(tracking.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        ImageButton call2 = (ImageButton) findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7893988535"));
                if (ActivityCompat.checkSelfPermission(tracking.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(tracking.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(tracking.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        ImageButton call3 = (ImageButton) findViewById(R.id.call3);
        call3.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9100872615"));
                if (ActivityCompat.checkSelfPermission(tracking.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(tracking.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(tracking.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        ImageButton call4 = (ImageButton) findViewById(R.id.call4);
        call4.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9133915819"));
                if (ActivityCompat.checkSelfPermission(tracking.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(tracking.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(tracking.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        ImageButton call5 = (ImageButton) findViewById(R.id.call5);
        call5.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9553508098"));
                if (ActivityCompat.checkSelfPermission(tracking.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(tracking.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(tracking.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        FirebaseDatabase database=FirebaseDatabase.getInstance();
        DatabaseReference myRef=database.getReference("Location");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                value=dataSnapshot.getValue(String.class);
                String [] separated =value.split(",");
                String latiPos =separated[0].trim();
                String longiPos =separated[1].trim();

                double dLat = Double.parseDouble(latiPos);
                double dLong= Double.parseDouble(longiPos);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }


        });
        DatabaseReference myRef2=database.getReference("Number");
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                val=dataSnapshot.getValue(String.class);
                int number = Integer.parseInt(val);
                strength=number;
                if(strength>50)
                {
                    //SmsManager smsManager = SmsManager.getDefault();
                    //smsManager.sendTextMessage("9553508098",null, "bus is over loaded",null, null);
                    Intent send =new Intent(Intent.ACTION_VIEW);
                    send.putExtra("address","9553508098");
                    send.putExtra("smsbody","bus is over loaded");
                    send.setType("vnd.android-dir/mms-sms");
                    startActivity(send);
                }
                int avai=50-number;
                String available =  Integer.toString(avai);
                String total ="50";



                TextView textView=(TextView) findViewById(R.id.available1);
                textView.setText(available);
                TextView textView2=(TextView) findViewById(R.id.filled1);
                textView2.setText(val);
                TextView textView3=(TextView) findViewById(R.id.total1);
                textView3.setText(total);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }

    public void buttonClicked(View view){
        Intent intent = new Intent(tracking.this,MapsActivity.class);
        intent.putExtra("LOCVAL",value);
        startActivity(intent);
    }
    public void buttonClicked2(View view){
        Intent intent = new Intent(tracking.this,MapsActivity2.class);
        startActivity(intent);
    }
    public void buttonClicked3(View view){
        Intent intent = new Intent(tracking.this,MapsActivity3.class);
        startActivity(intent);
    }
    public void buttonClicked4(View view){
        Intent intent = new Intent(tracking.this,MapsActivity4.class);
        startActivity(intent);
    }
    public void buttonClicked5(View view){
        Intent intent = new Intent(tracking.this,MapsActivity5.class);
        startActivity(intent);
    }
}
