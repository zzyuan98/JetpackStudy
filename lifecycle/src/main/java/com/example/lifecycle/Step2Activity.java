package com.example.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

//LifeCycle解耦
public class Step2Activity extends AppCompatActivity {


    private MyChronometer chronometer;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);
        getLifecycle().addObserver(chronometer);//添加生命周期监听

    }


}