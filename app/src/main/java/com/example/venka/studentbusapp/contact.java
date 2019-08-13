package com.example.venka.studentbusapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;



public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ImageButton call = (ImageButton) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            public static final int MY_PERMISSIONS_REQUEST_CALL_PHONE =0 ;

            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9133915819"));
                if (ActivityCompat.checkSelfPermission(contact.this,android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(contact.this,
                            android.Manifest.permission.CALL_PHONE)) {
                    } else {
                        ActivityCompat.requestPermissions(contact.this,
                                new String[]{android.Manifest.permission.CALL_PHONE},
                                MY_PERMISSIONS_REQUEST_CALL_PHONE);
                    }
                }
                startActivity(callIntent);
            }
        });
        ImageButton mail = (ImageButton) findViewById(R.id.mail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","harsha.varri@gmail.com", null));
                String subject="regarding bus service";
                String message="problem.......";
                intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(Intent.createChooser(intent, "Choose an Email client :"));
            }
        });



    }
}
