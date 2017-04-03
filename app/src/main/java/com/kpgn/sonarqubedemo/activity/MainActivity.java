package com.kpgn.sonarqubedemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kpgn.sonarqubedemo.R;
import com.kpgn.sonarqubedemo.application.SonarQubeDemoApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SonarQubeDemoApplication.inject(this);
    }
}
