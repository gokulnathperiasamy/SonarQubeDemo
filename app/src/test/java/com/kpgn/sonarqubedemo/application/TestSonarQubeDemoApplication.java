package com.kpgn.sonarqubedemo.application;

public class TestSonarQubeDemoApplication extends SonarQubeDemoApplication {

    @Override
    protected Object[] getModules() {
        Object[] modules = {new TestSonarQubeDemoModule()};

        return modules;
    }
}