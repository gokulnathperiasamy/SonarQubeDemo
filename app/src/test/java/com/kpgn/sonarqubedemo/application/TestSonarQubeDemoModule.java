package com.kpgn.sonarqubedemo.application;

import com.kpgn.sonarqubedemo.activity.MainActivity;
import com.kpgn.sonarqubedemo.activity.MainActivityTest;

import dagger.Module;

@Module(
        injects = {
                MainActivity.class,
                MainActivityTest.class,
                TestSonarQubeDemoApplication.class,
                SonarQubeDemoApplication.class,
        })
public class TestSonarQubeDemoModule {

}