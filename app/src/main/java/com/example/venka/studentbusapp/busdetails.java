package com.example.venka.studentbusapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class busdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busdetails);
        TextView call = (TextView) findViewById(R.id.call0);
        call.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7995323275"));
                if (ActivityCompat.checkSelfPermission(busdetails.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(busdetails.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(busdetails.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        TextView call1 = (TextView) findViewById(R.id.call1);
        call1.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7032236399"));
                if (ActivityCompat.checkSelfPermission(busdetails.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(busdetails.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(busdetails.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        TextView call2 = (TextView) findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7893988535"));
                if (ActivityCompat.checkSelfPermission(busdetails.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(busdetails.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(busdetails.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        TextView call3 = (TextView) findViewById(R.id.call3);
        call3.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9100872615"));
                if (ActivityCompat.checkSelfPermission(busdetails.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(busdetails.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(busdetails.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        TextView call4 = (TextView) findViewById(R.id.call4);
        call4.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9133915819"));
                if (ActivityCompat.checkSelfPermission(busdetails.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(busdetails.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(busdetails.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });

        TextView call5 = (TextView) findViewById(R.id.call5);
        call5.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9553508098"));
                if (ActivityCompat.checkSelfPermission(busdetails.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(busdetails.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(busdetails.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });
    }
}
