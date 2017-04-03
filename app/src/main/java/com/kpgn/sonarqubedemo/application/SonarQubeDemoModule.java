package com.kpgn.sonarqubedemo.application;

import android.content.Context;

import com.kpgn.sonarqubedemo.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                Context.class,
                MainActivity.class,
                SonarQubeDemoApplication.class,
        })
public class SonarQubeDemoModule {
    private Context context;

    public SonarQubeDemoModule(Context context) {
        this.context = context;
    }

	// Trigger Build
    @Provides
    @Singleton
    public Context providesContext() {
        return context;
    }
}
