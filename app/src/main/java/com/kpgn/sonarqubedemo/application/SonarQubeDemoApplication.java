package com.kpgn.sonarqubedemo.application;

import android.app.Application;

import dagger.ObjectGraph;
import timber.log.Timber;

public class SonarQubeDemoApplication extends Application {

    protected static ObjectGraph objectGraph;
    private static SonarQubeDemoApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.uprootAll();
        instance = this;
        objectGraph = ObjectGraph.create(getModules());
        inject(this);
    }

    protected Object[] getModules() {
        Object[] modules = {new SonarQubeDemoModule(this)};
        return modules;
    }

    public static void inject(Object object) {
        objectGraph.inject(object);
    }

    public static <T> T get(Class<T> clazz) {
        return objectGraph.get(clazz);
    }
}
