package com.ric.gyroscopetest;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private TextView x,y,z;
    private SensorManager sensorManager;
    private Sensor accelorometter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = findViewById(R.id.x);
        y= findViewById(R.id.y);
        z= findViewById(R.id.z);

    }
}