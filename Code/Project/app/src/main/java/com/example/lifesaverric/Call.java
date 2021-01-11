package com.example.lifesaverric;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.app.ActivityCompat;

import com.google.firebase.auth.FirebaseAuth;

public class Call extends android.app.Activity {
    private Button button,btn;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        fAuth = FirebaseAuth.getInstance();
                button = findViewById(R.id.logout);
                btn= findViewById(R.id.btn);

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel: 01777183861"));
                if (ActivityCompat.checkSelfPermission(Call.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                startActivity(new Intent(Call.this,HomePage.class));
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                fAuth.signOut();
                startActivity(new Intent(Call.this,Login.class));
            }
        });

            }


    }
