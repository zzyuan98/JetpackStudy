package com.example.lifecycle;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

//LifeCycle解耦
public class Step3Activity extends AppCompatActivity {




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);


    }


    public void startGps(View view) {
        startService(new Intent(this,MyLocationService.class));
    }

    public void stopGps(View view) {
        stopService(new Intent(this,MyLocationService.class));
    }
}